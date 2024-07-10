package eu.chrost.patterns.behavioral.templatemethod;

class SmallCoffee extends Coffee {
    @Override
    protected int getDrinkAmountInMl() {
        return 150;
    }
}
