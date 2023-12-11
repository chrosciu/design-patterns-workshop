package eu.chrost.patterns.structural.bridge;

class RegularPrice extends Price {
    @Override
    String getPriceType() {
        return "regular";
    }
}
