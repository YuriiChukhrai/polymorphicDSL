package com.pdsl.junit;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.jacoco.core.analysis.ICoverageNode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PdslGherkinApplication {
    String context() default "Unspecified";
    String applicationName() default "Polymorphic DSL System Under Test";
    String resourceRoot() default "";
    Class<? extends Parser> dslRecognizerParser() default EmptyRecognizerParser.class;
    Class<? extends Lexer> dslRecognizerLexer() default EmptyRecognizerLexer.class;
    String recognizerRule() default RecognizedBy.DEFAULT_RECOGNIZER_RULE_NAME;
}
