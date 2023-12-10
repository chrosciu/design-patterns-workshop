package eu.chrost.patterns.structural.bridge;

class DiscountRailwayTicket extends Ticket {
    @Override
    String getTransportationType() {
        return "railway";
    }

    @Override
    String getPriceType() {
        return "discount";
    }
}
