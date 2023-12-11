package eu.chrost.patterns.behavioral.templatemethod;

class SmallCoffee extends Coffee {
    public SmallCoffee(DrinkMachine drinkMachine) {
        super(drinkMachine);
    }

    @Override
    protected int getDrinkAmountInMl() {
        return 150;
    }
}
