package eu.chrost.patterns.structural.bridge;

class RegularAirTicket extends Ticket {
    @Override
    String getTransportationType() {
        return "air";
    }

    @Override
    String getPriceType() {
        return "regular";
    }
}
