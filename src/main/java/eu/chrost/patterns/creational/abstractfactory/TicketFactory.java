package eu.chrost.patterns.creational.abstractfactory;

abstract class TicketFactory {
    abstract Ticket createTicket();
    abstract Price createPrice();
}
