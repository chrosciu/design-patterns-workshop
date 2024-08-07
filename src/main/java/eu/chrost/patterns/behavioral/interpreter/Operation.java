package eu.chrost.patterns.behavioral.interpreter;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class Operation implements Expression {
    private final Expression firstExpression;
    private final Expression secondExpression;
    private final Operator operator;

    @Override
    public double evaluate(Map<String, Double> context) {
        return operator.apply(firstExpression.evaluate(context), secondExpression.evaluate(context));
    }

}
