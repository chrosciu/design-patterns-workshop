package eu.chrost.patterns.behavioral.interpreter;

import java.util.function.BiFunction;

public interface Operator extends BiFunction<Double, Double, Double> {
}
