package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.COFFEE;

class Coffee extends Drink {
    public Coffee(DrinkMachine drinkMachine) {
        super(drinkMachine);
    }

    @Override
    protected void addGranulate() {
        drinkMachine.addGranulate(COFFEE);
    }
}
