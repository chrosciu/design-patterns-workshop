package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.TEA;

class BitterTea extends Drink {
    @Override
    protected void addGranulate(DrinkMachine drinkMachine) {
        drinkMachine.addGranulate(TEA);
    }
}
