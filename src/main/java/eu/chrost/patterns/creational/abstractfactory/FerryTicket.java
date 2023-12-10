package eu.chrost.patterns.creational.abstractfactory;

class FerryTicket extends Ticket {
    @Override
    String getTransportationType() {
        return "ferry";
    }
}
