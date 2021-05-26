package com.pdsl.gherkin;

import com.pdsl.gherkin.models.*;
import com.pdsl.transformers.PolymorphicDslFileException;
import com.pdsl.gherkin.models.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class PickleJarFactory {

    private final int ABBREVIATED_DESCRIPTION_LENGTH = 1024;
    private PdslGherkinInterpreter pdslGherkinInterpreter;
    private PdslGherkinListener listener;
    private final Charset charset;

    public static PickleJarFactory DEFAULT = new PickleJarFactory(new PdslGherkinInterpreterImpl(), new PdslGherkinListenerImpl(), StandardCharsets.UTF_8);
    public PickleJarFactory(PdslGherkinInterpreter pdslGherkinInterpreter, PdslGherkinListener gherkinListener, Charset charset) {
        this.pdslGherkinInterpreter = pdslGherkinInterpreter;
        this.listener = gherkinListener;
        this.charset = charset;
    }

    /**
     * Converts a list of feature files into a list of {@code PickleJar}.
     * <p>
     * The primary purpose of this is to both  read all of the feature files (and making sure they exist) and
     * parameter substitutions on the text if needed
     *
     * @param dslTestFilePaths List of paths to feature files
     * @return A List of PickleJars, where each pickle jar represents a processed feature
     */
    public List<PickleJar> getPickleJars(List<String> dslTestFilePaths) {
        List<GherkinFeature> features = new LinkedList<>();
        // Parse each gherkin file
        try {
            for (String filepath : dslTestFilePaths) {
                features.add(pdslGherkinInterpreter.interpretGherkinFileStrictly(filepath, listener));
            }
        } catch (IOException e) {
            throw new PolymorphicDslFileException("Could not open file!", e);
        }
        List<PickleJar> pickleJars = new LinkedList<>();
        // Process each gherkin feature into a test specification
        for (GherkinFeature feature : features) {
            PickleJar.Builder pickleJarBuilder = new PickleJar.Builder(feature.getLocation(), feature.getTitle().orElseThrow(), feature.getLanguageCode());
            // Feature tags
            if (feature.getTags().isPresent()) {
                pickleJarBuilder.withFeatureTags(processTags(feature.getTags().get()));
            }
            // Feature background
            if (feature.getBackground().isPresent()) {
                pickleJarBuilder.withGherkinBackground(feature.getBackground().get());
            }
            // Feature Description
            if (feature.getLongDescription().isPresent()) {
                pickleJarBuilder.withLongDescription(feature.getLongDescription().get());
            }
            // Top level scenarios
            if (feature.getOptionalGherkinScenarios().isPresent()) {
                List<PickleJar.PickleJarScenario> topLevelPickles =
                        convertScenariosToPickleJarScenarios(feature.getOptionalGherkinScenarios().get());
                pickleJarBuilder.withFeatureLevelScenarios(topLevelPickles);
            }
            // Add all rules
            if (feature.getRules().isPresent()) {
                pickleJarBuilder.withRules(convertRulesToPickles(feature.getRules().get()));
            }
            pickleJars.add(pickleJarBuilder.build());
        }
        return pickleJars;
    }


    private List<PickleJar.PickleJarScenario> convertScenariosToPickleJarScenarios(List<GherkinScenario> scenarios) {
        List<PickleJar.PickleJarScenario> pickleJarScenarios = new LinkedList<>();
        for (GherkinScenario scenario : scenarios) {
            // If the scenario has an examples table the tags will need to be combined with the scenario level
            Set<String> tags = new HashSet<>();
            if (scenario.getTags().isPresent()) {
                tags.addAll(processTags(scenario.getTags().get()));
            }
            if (scenario.getExamples().isPresent()) {
                for (GherkinExamplesTable table : scenario.getExamples().get()) {
                    Set<String> tableTags = new HashSet<>();
                    tableTags.addAll(tags);
                    for (Map<String, String> substitutions : table.getRows()) {
                        // steps list is guaranteed to be present by the pdslGherkinInterpreter
                        // Substitutions may need to be made on each step, docstring or gherkin table
                        List<String> substitutedSteps = getTextSubstitutionsForStepBody(scenario.getStepsList().get(), substitutions);
                        // Create a pickle with the substituted steps
                        PickleJar.PickleJarScenario.Builder builder = new PickleJar.PickleJarScenario.Builder(
                                scenario.getTitle().get().getStringWithSubstitutions(substitutions),
                                substitutedSteps);
                        if (scenario.getLongDescription().isPresent()) {
                            builder.withLongDescription(scenario.getLongDescription().get().getStringWithSubstitutions(substitutions));
                        }
                        if (table.getTags().isPresent()) {
                            tableTags.addAll(processTags(table.getTags().get()));
                        }
                        builder.withTags(processTags(tableTags));
                        pickleJarScenarios.add(builder.build());
                    }
                }
            } else { // No substitutions needed
                // steps list is guaranteed to be present by the pdslGherkinInterpreter
                // Substitutions may need to be made on each step, docstring or gherkin table
                List<String> stepBody = getTextFromStepBody(scenario.getStepsList().get());
                // Create a pickle with the substituted steps
                PickleJar.PickleJarScenario.Builder builder = new PickleJar.PickleJarScenario.Builder(
                        scenario.getTitle().get().getRawString(),
                        stepBody);
                if (!tags.isEmpty()) {
                    builder.withTags(processTags(tags));
                }
                if (scenario.getLongDescription().isPresent()) {
                    String longDescription = scenario.getLongDescription().get().getRawString();
                    builder.withLongDescription(longDescription);
                }
                pickleJarScenarios.add(builder.build());
            }
        }
        return pickleJarScenarios;
    }

    private List<PickleJar.PickleJarRule> convertRulesToPickles(List<GherkinRule> rules) {
        List<PickleJar.PickleJarRule> pickleJarRules = new LinkedList<>();
        for (GherkinRule rule : rules) {

            List<PickleJar.PickleJarScenario> scenarios = convertScenariosToPickleJarScenarios(rule.getScenarios().get());
            PickleJar.PickleJarRule.Builder builder = new PickleJar.PickleJarRule.Builder(rule.getTitle().orElseThrow(), scenarios);
            if (rule.getBackground().isPresent()) {
                builder.withBackground(rule.getBackground().get());
            }
            if (rule.getLongDescription().isPresent()) {
                builder.withLongDescription(rule.getLongDescription().get());
            }
            pickleJarRules.add(builder.build());
        }
        return pickleJarRules;
    }

    private List<String> getTextSubstitutionsForStepBody(List<GherkinStep> stepBody, Map<String, String> substitutions) {
        List<String> substitutedStepBody = new LinkedList<>();
        for (GherkinStep step : stepBody) {
            StringBuilder substitutedStep = new StringBuilder();
            GherkinString stepContent = step.getStepContent();
            substitutedStep.append(stepContent.getStringWithSubstitutions(substitutions));
            if (step.getDocString().isPresent()) {
                GherkinString docString = step.getDocString().get().getGherkinString();
                substitutedStep.append("\n" + docString.getStringWithSubstitutions(substitutions));
            } else if (step.getDataTable().isPresent()) { //TODO: Maybe we should be storing the raw text of the data table as well to simplify this?
                // Perform all substitutions
                List<List<String>> substitutedDataTable =
                        step.getDataTable().get().stream().map(row ->
                                row.stream().map(cell -> cell.getStringWithSubstitutions(substitutions))
                                        .collect(Collectors.toUnmodifiableList()))
                                .collect(Collectors.toUnmodifiableList());
                List<List<GherkinString>> dataTable = step.getDataTable().get();
                // Convert to a string
                substitutedStep.append(getDataTableText(substitutedDataTable));
            }
            substitutedStepBody.add(substitutedStep.toString());
        }
        return substitutedStepBody;
    }

    private List<String> getTextFromStepBody(List<GherkinStep> stepBody) {
        List<String> substitutedStepBody = new LinkedList<>();
        for (GherkinStep step : stepBody) {
            StringBuilder stepText = new StringBuilder();
            GherkinString stepContent = step.getStepContent();
            stepText.append(stepContent.getRawString());
            if (step.getDocString().isPresent()) {
                GherkinString docString = step.getDocString().get().getGherkinString();
                stepText.append("\n" + docString.getRawString());
            } else if (step.getDataTable().isPresent()) { //TODO: Maybe we should be storing the raw text of the data table as well to simplify this?
                // Perform all substitutions
                List<List<String>> substitutedDataTable =
                        step.getDataTable().get().stream().map(row ->
                                row.stream().map(cell -> cell.getRawString())
                                        .collect(Collectors.toUnmodifiableList()))
                                .collect(Collectors.toUnmodifiableList());
                List<List<GherkinString>> dataTable = step.getDataTable().get();
                // Convert to a string
                stepText.append(getDataTableText(substitutedDataTable));
            }
            substitutedStepBody.add(stepText.toString());
        }
        return substitutedStepBody;
    }

    private String getDataTableText(List<List<String>> substitutedDataTable) {
        return String.join("\n",  // Separate each row by a line break
                substitutedDataTable.stream().map(row -> "|" + String.join("|", row) + "|") // Separate each cell with a pipe
                        .collect(Collectors.toUnmodifiableList())) + "\n";
    }

    private String abbreviateStringIfRequired(String str) {
        return str.length() > ABBREVIATED_DESCRIPTION_LENGTH
                ? str.substring(0, ABBREVIATED_DESCRIPTION_LENGTH) + "\n<abbrevated>" : str;
    }

    private Set<String> processTags(Collection<String> rawTags) {
        Set<String> tags = new HashSet<>();
        ByteArrayOutputStream tagBuilder = new ByteArrayOutputStream();
        for (String rawTag : rawTags) {
            String remainingTag = tagBuilder.toString(charset);
            if (!remainingTag.isBlank()) {
                tags.add(remainingTag);
                tagBuilder.reset();
            }
            boolean buildingTag = false;
            for (int i = 0; i < rawTag.length(); i++) {
                char c = rawTag.charAt(i);
                switch (c) {
                    case ' ': /* fall through */
                    case '\t': /* fall through */
                    case '\n': /* fall through */
                        if (buildingTag) { // We encountered an @ earlier
                            tags.add(tagBuilder.toString(charset));
                            tagBuilder.reset();
                            ;
                            buildingTag = false;
                        } else { // We're skipping whitespace at the start of the string
                            continue;
                        }
                        break;
                    case '#':
                        if (!buildingTag) { // Comment at end of raw tag. Ignore the rest
                            return tags;
                        }
                        tagBuilder.write(c);
                        break;
                    case '@':
                        if (buildingTag) { //Joined tag (e.g, @tagOne@tagTwo
                            tags.add(tagBuilder.toString(charset));
                            tagBuilder.reset();
                        }
                        buildingTag = true;
                        /* fall through */
                    default:
                        if (buildingTag) {
                            tagBuilder.write(c);
                        } else {
                            throw new IllegalArgumentException("Illegal tags. Got confused by " + rawTag);
                        }
                        buildingTag = true;
                        break;
                }
            }
        }
        String remainingTag = tagBuilder.toString(charset);
        if (!remainingTag.isBlank()) {
            tags.add(remainingTag);
            tagBuilder.reset();
        }
            return tags;
    }
}