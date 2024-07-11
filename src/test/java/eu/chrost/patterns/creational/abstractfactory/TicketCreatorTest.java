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
        var ticketFactory = ticketCreator.createTicketFactory(REGULAR_AIR);

        //then
        assertThat(ticketFactory.createTicket().getTransportationType()).isEqualTo("air");
        assertThat(ticketFactory.createPrice().getPriceType()).isEqualTo("regular");
    }

    @Test
    void discountRailwayTicket() {
        //when
        var ticketDto = ticketCreator.createTicketFactory(DISCOUNT_RAILWAY);

        //then
        assertThat(ticketDto.createTicket().getTransportationType()).isEqualTo("railway");
        assertThat(ticketDto.createPrice().getPriceType()).isEqualTo("discount");
    }

    @Test
    void flexFerryTicket() {
        //when
        var ticketDto = ticketCreator.createTicketFactory(FLEX_FERRY);

        //then
        assertThat(ticketDto.createTicket().getTransportationType()).isEqualTo("ferry");
        assertThat(ticketDto.createPrice().getPriceType()).isEqualTo("flex");
    }
}
