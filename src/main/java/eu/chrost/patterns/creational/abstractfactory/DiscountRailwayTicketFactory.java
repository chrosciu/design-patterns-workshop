package eu.chrost.patterns.creational.abstractfactory;

class DiscountRailwayTicketFactory extends TicketFactory {
    @Override
    Ticket createTicket() {
        return new RailwayTicket();
    }

    @Override
    Price createPrice() {
        return new DiscountPrice();
    }
}
