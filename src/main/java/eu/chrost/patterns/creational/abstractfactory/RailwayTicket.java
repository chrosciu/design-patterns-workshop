package eu.chrost.patterns.creational.abstractfactory;

class RailwayTicket extends Ticket {
    @Override
    String getTransportationType() {
        return "railway";
    }
}
