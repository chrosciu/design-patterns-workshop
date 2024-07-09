package eu.chrost.patterns.creational.abstractfactory;

class TicketCreator {
    public TicketFactory createTicketFactory(TicketType ticketType) {
        return switch (ticketType) {
            case REGULAR_AIR -> new RegularAirTicketFactory();
            case DISCOUNT_RAILWAY -> new DiscountRailwayTicketFactory();
            case FLEX_FERRY -> new FlexFerryTicketFactory();
        };
    }
}
