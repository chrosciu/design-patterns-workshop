package eu.chrost.patterns.structural.bridge;

class FerryTicket extends Ticket {
    public FerryTicket(Price price) {
        super(price);
    }

    @Override
    String getTransportationType() {
        return "ferry";
    }
}
