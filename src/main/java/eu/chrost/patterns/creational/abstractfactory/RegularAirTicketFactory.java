package eu.chrost.patterns.creational.abstractfactory;

class RegularAirTicketFactory extends TicketFactory {
    @Override
    Ticket createTicket() {
        return new AirTicket();
    }

    @Override
    Price createPrice() {
        return new RegularPrice();
    }
}
