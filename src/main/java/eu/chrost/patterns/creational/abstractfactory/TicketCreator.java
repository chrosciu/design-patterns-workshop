package eu.chrost.patterns.creational.abstractfactory;

class TicketCreator {

    public TicketFactory getTicketFactory(TicketType ticketType) {
        switch (ticketType) {
            case REGULAR_AIR:
                return new RegularAirTicketFactory();
            case DISCOUNT_RAILWAY:
                return new DiscountRailwayTicketFactory();
            case FLEX_FERRY:
                return new FlexFerryTicketFactory();
            default:
                throw new UnsupportedOperationException("Unsupported ticket type: " + ticketType);
        }
    }
}
