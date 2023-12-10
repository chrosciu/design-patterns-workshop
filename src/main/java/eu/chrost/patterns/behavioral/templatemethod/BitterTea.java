package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.CoffeeMachine.Granulate.TEA;

public class BitterTea extends Drink {
    public BitterTea(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    protected void addGranulate() {
        coffeeMachine.addGranulate(TEA);
    }
}
