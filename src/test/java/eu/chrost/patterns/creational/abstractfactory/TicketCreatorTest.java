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
        var ticketFactory = ticketCreator.getTicketFactory(REGULAR_AIR);

        //then
        assertThat(ticketFactory.createTicket().getTransportationType()).isEqualTo("air");
        assertThat(ticketFactory.createPrice().getPriceType()).isEqualTo("regular");
    }

    @Test
    void discountRailwayTicket() {
        //when
        var ticketFactory = ticketCreator.getTicketFactory(DISCOUNT_RAILWAY);

        //then
        assertThat(ticketFactory.createTicket().getTransportationType()).isEqualTo("railway");
        assertThat(ticketFactory.createPrice().getPriceType()).isEqualTo("discount");
    }

    @Test
    void flexFerryTicket() {
        //when
        var ticketFactory = ticketCreator.getTicketFactory(FLEX_FERRY);

        //then
        assertThat(ticketFactory.createTicket().getTransportationType()).isEqualTo("ferry");
        assertThat(ticketFactory.createPrice().getPriceType()).isEqualTo("flex");
    }
}
