package eu.chrost.patterns.structural.bridge;

class DiscountPrice extends Price {
    @Override
    String getPriceType() {
        return "discount";
    }
}
