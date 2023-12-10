package eu.chrost.patterns.creational.abstractfactory;

import lombok.Value;

@Value
class TicketDto {
    Ticket ticket;
    Price price;
}
