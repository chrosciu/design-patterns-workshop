package eu.chrost.patterns.creational.abstractfactory;

class TicketCreator {
    public TicketFactory createTicketFactory(TicketType ticketType) {
        return switch (ticketType) {
            case REGULAR_AIR -> new RegularAirTicketFactory();
            default -> throw new UnsupportedOperationException("Unsupported ticket type: " + ticketType);
        };
    }
}
