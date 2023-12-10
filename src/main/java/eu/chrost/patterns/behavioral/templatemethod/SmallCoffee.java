package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.CoffeeMachine.Granulate.COFFEE;

public class SmallCoffee extends Drink {
    public SmallCoffee(CoffeeMachine coffeeMachine) {
        super(coffeeMachine);
    }

    @Override
    protected void addGranulate() {
        coffeeMachine.addGranulate(COFFEE);
    }

    @Override
    protected void pourDrink() {
        coffeeMachine.pourDrink(150);
    }
}
