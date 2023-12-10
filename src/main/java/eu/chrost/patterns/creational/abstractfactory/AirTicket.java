package eu.chrost.patterns.creational.abstractfactory;

class AirTicket extends Ticket {
    @Override
    String getTransportationType() {
        return "air";
    }
}
