package eu.chrost.patterns.behavioral.templatemethod;

import lombok.NonNull;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.TEA;

class DrinkMachine {

    protected enum Granulate {
        TEA,
        COFFEE
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void addGranulate(@NonNull Granulate granulate) {
        System.out.printf("Adding %s granulate\n", granulate);
    }

    protected void addSugar(int spoons) {
        System.out.printf("Adding %d spoons of sugar\n", spoons);
    }

    protected void pourDrink(int amountInMl) {
        System.out.printf("Pouring %d ml of drink\n", amountInMl);
    }

    public void makeDrink(Drink drink) {
        drink.prepare();
    }

    @Deprecated
    public void makeTea() {
        new Tea(this).prepare();
    }

    @Deprecated
    public void makeBitterTea() {
        new BitterTea(this).prepare();
    }

}
