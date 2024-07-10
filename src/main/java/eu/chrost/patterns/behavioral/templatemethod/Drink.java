package eu.chrost.patterns.behavioral.templatemethod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class Drink {

    public void prepare(DrinkMachine drinkMachine) {
        boilWater(drinkMachine);
        addGranulate(drinkMachine);
        var sugarAmount = getSugarAmount();
        if (sugarAmount > 0) {
            addSugar(drinkMachine, sugarAmount);
        }
        var amountInMl = getDrinkAmountInMl();
        pourDrink(drinkMachine, amountInMl);
    }

    private void boilWater(DrinkMachine drinkMachine) {
        drinkMachine.boilWater();
    }

    protected abstract void addGranulate(DrinkMachine drinkMachine);

    protected int getSugarAmount() {
        return 0;
    }

    private void addSugar(DrinkMachine drinkMachine, int sugarAmount) {
        drinkMachine.addSugar(sugarAmount);
    }

    protected int getDrinkAmountInMl() {
        return 250;
    }

    private void pourDrink(DrinkMachine drinkMachine, int amountInMl) {
        drinkMachine.pourDrink(amountInMl);
    }
}
