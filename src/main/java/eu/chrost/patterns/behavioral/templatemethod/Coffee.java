package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.COFFEE;

class Coffee extends Drink {
    @Override
    protected void addGranulate(DrinkMachine drinkMachine) {
        drinkMachine.addGranulate(COFFEE);
    }
}
