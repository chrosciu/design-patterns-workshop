package eu.chrost.patterns.structural.bridge;

abstract class Ticket {
    abstract String getTransportationType();

    abstract String getPriceType();
}
