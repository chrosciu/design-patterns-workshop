package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.TEA;

class Tea extends Drink {
    @Override
    protected void addGranulate(DrinkMachine drinkMachine) {
        drinkMachine.addGranulate(TEA);
    }

    @Override
    protected int getSugarAmount() {
        return 2;
    }
}
