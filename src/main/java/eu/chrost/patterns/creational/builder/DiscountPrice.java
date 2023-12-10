package eu.chrost.patterns.creational.builder;

class DiscountPrice extends Price {
    @Override
    String getPriceType() {
        return "discount";
    }
}
