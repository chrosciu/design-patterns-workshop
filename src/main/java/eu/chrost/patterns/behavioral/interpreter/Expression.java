package eu.chrost.patterns.behavioral.interpreter;

import java.util.Map;

public interface Expression {
    double evaluate(Map<String, Double> context);
}
