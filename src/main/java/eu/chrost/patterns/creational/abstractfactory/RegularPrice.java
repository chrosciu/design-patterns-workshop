package eu.chrost.patterns.creational.abstractfactory;

class RegularPrice extends Price {
    @Override
    String getPriceType() {
        return "regular";
    }
}
