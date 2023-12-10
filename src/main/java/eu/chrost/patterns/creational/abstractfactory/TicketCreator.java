package eu.chrost.patterns.creational.abstractfactory;

import static eu.chrost.patterns.creational.abstractfactory.TicketType.REGULAR_AIR;

class TicketCreator {

    public TicketDto createTicket(TicketType ticketType) {
        if (REGULAR_AIR == ticketType) {
            return new TicketDto(new AirTicket(), new RegularPrice());
        }
        throw new UnsupportedOperationException("Unsupported ticket type: " + ticketType);
    }
}
