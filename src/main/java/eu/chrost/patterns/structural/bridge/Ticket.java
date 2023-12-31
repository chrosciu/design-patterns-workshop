package eu.chrost.patterns.structural.bridge;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class Ticket {
    protected final Price price;
    abstract String getTransportationType();

    String getPriceType() {
        return price.getPriceType();
    }
}
