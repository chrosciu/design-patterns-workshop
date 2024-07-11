package eu.chrost.patterns.structural.bridge;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class Ticket {
    private final Price price;

    abstract String getTransportationType();

    String getPriceType() {
        return price.getPriceType();
    }
}
