package eu.chrost.patterns.creational.abstractfactory;

class FlexPrice extends Price {
    @Override
    String getPriceType() {
        return "flex";
    }
}
