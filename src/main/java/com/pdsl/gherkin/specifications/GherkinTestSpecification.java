package com.pdsl.gherkin.specifications;

import com.pdsl.specifications.DefaultTestSpecification;
import com.pdsl.specifications.TestSpecification;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayOutputStream;
import java.util.*;

public class GherkinTestSpecification implements TestSpecification {

    private final Set<String> tags;
    private final TestSpecification testSpecification;

    public GherkinTestSpecification(TestSpecification testSpecification, Set<String> tags) {
        this.tags = tags;
        this.testSpecification = testSpecification;
    }

    public GherkinTestSpecification(List<GherkinTestSpecification> gherkinTestSpecifications) {
        this.tags = Set.of();
        this.testSpecification = new DefaultTestSpecification.Builder("Gherkin test container")
                .withChildTestSpecifications(new ArrayList<>(gherkinTestSpecifications))
                .build();
    }

    public Set<String> getTags() {
        return tags;
    }

    @Override
    public Optional<ByteArrayOutputStream> getMetaData() {
        return testSpecification.getMetaData();
    }

    @Override
    public Optional<List<TestSpecification>> nestedTestSpecifications() {
        return testSpecification.nestedTestSpecifications();
    }

    @Override
    public String getId() {
        return testSpecification.getId();
    }

    @Override
    public Optional<Iterator<ParseTree>> getPhraseIterator() {
        return testSpecification.getPhraseIterator();
    }

    @Override
    public Optional<List<ParseTree>> getPhrases() {
        return testSpecification.getPhrases();
    }
}