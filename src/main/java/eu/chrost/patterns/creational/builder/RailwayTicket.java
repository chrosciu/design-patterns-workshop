package eu.chrost.patterns.creational.builder;

class RailwayTicket extends Ticket {
    public RailwayTicket(Price price) {
        super(price);
    }

    @Override
    String getTransportationType() {
        return "railway";
    }
}
