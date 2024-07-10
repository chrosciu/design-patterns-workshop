package eu.chrost.patterns.behavioral.templatemethod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class Drink {
    protected final DrinkMachine drinkMachine;

    public void prepare() {
        boilWater();
        addGranulate();
        var sugarAmount = getSugarAmount();
        if (sugarAmount > 0) {
            addSugar(sugarAmount);
        }
        var amountInMl = getDrinkAmountInMl();
        pourDrink(amountInMl);
    }

    private void boilWater() {
        drinkMachine.boilWater();
    }

    protected abstract void addGranulate();

    protected int getSugarAmount() {
        return 0;
    }

    private void addSugar(int sugarAmount) {
        drinkMachine.addSugar(sugarAmount);
    }

    protected int getDrinkAmountInMl() {
        return 250;
    }

    private void pourDrink(int amountInMl) {
        drinkMachine.pourDrink(amountInMl);
    }
}
