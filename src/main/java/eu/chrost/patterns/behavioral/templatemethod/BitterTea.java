package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.TEA;

class BitterTea extends Drink {
    public BitterTea(DrinkMachine drinkMachine) {
        super(drinkMachine);
    }

    @Override
    protected void addGranulate() {
        drinkMachine.addGranulate(TEA);
    }
}
