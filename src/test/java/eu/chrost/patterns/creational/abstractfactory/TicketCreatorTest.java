package eu.chrost.patterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static eu.chrost.patterns.creational.abstractfactory.TicketType.DISCOUNT_RAILWAY;
import static eu.chrost.patterns.creational.abstractfactory.TicketType.FLEX_FERRY;
import static eu.chrost.patterns.creational.abstractfactory.TicketType.REGULAR_AIR;
import static org.assertj.core.api.Assertions.assertThat;

class TicketCreatorTest {
    private final TicketCreator ticketCreator = new TicketCreator();

    @Test
    void regularAirTicket() {
        //when
        var ticketDto = ticketCreator.createTicket(REGULAR_AIR);

        //then
        assertThat(ticketDto.getTicket().getTransportationType()).isEqualTo("air");
        assertThat(ticketDto.getPrice().getPriceType()).isEqualTo("regular");
    }

    @Test
    void discountRailwayTicket() {
        //when
        var ticketDto = ticketCreator.createTicket(DISCOUNT_RAILWAY);

        //then
        assertThat(ticketDto.getTicket().getTransportationType()).isEqualTo("railway");
        assertThat(ticketDto.getPrice().getPriceType()).isEqualTo("discount");
    }

    @Test
    void flexFerryTicket() {
        //when
        var ticketDto = ticketCreator.createTicket(FLEX_FERRY);

        //then
        assertThat(ticketDto.getTicket().getTransportationType()).isEqualTo("ferry");
        assertThat(ticketDto.getPrice().getPriceType()).isEqualTo("flex");
    }
}
