package eu.chrost.patterns.behavioral.templatemethod;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.TEA;

class Tea extends Drink {
    public Tea(DrinkMachine drinkMachine) {
        super(drinkMachine);
    }

    @Override
    protected void addGranulate() {
        drinkMachine.addGranulate(TEA);
    }

    @Override
    protected int getSugarAmount() {
        return 2;
    }
}
