package eu.chrost.patterns.creational.builder;

class RegularPrice extends Price {
    @Override
    String getPriceType() {
        return "regular";
    }
}
