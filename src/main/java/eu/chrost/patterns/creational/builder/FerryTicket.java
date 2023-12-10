package eu.chrost.patterns.creational.builder;

class FerryTicket extends Ticket {
    public FerryTicket(Price price) {
        super(price);
    }

    @Override
    String getTransportationType() {
        return "ferry";
    }
}
