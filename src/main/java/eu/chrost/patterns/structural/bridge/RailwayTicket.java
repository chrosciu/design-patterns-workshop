package eu.chrost.patterns.structural.bridge;

class RailwayTicket extends Ticket {
    public RailwayTicket(Price price) {
        super(price);
    }

    @Override
    String getTransportationType() {
        return "railway";
    }
}
