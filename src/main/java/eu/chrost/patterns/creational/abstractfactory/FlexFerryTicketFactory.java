package eu.chrost.patterns.creational.abstractfactory;

class FlexFerryTicketFactory extends TicketFactory {
    @Override
    Ticket createTicket() {
        return new FerryTicket();
    }

    @Override
    Price createPrice() {
        return new FlexPrice();
    }
}
