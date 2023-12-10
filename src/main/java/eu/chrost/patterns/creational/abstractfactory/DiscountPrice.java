package eu.chrost.patterns.creational.abstractfactory;

class DiscountPrice extends Price {
    @Override
    String getPriceType() {
        return "discount";
    }
}
