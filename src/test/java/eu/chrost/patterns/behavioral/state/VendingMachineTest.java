package eu.chrost.patterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VendingMachineTest {
    @Test
    void shouldSellAvailableProductsForInsertedMoney() {
        //given
        var vendingMachine = new VendingMachine(10);

        //when / then
        assertThat(vendingMachine.dispenseProduct()).isEqualTo("Items sold out");
        assertThat(vendingMachine.insertMoney(1)).isEqualTo("Cannot accept money - items sold out");
        assertThat(vendingMachine.refill(3)).isEqualTo("Machine refilled");
        assertThat(vendingMachine.dispenseProduct()).isEqualTo("Cannot dispense product - amount 10 must be paid");
        assertThat(vendingMachine.insertMoney(20)).isEqualTo("Money accepted");
        assertThat(vendingMachine.dispenseProduct()).isEqualTo("Dispensing product and change 10");
        assertThat(vendingMachine.insertMoney(10)).isEqualTo("Money accepted");
        assertThat(vendingMachine.dispenseProduct()).isEqualTo("Dispensing product and change 0");
        assertThat(vendingMachine.insertMoney(5)).isEqualTo("Money accepted");
        assertThat(vendingMachine.dispenseProduct()).isEqualTo("Cannot dispense product - amount 5 must be paid");
        assertThat(vendingMachine.insertMoney(5)).isEqualTo("Money accepted");
        assertThat(vendingMachine.cancelPurchase()).isEqualTo("Returning 10");
        assertThat(vendingMachine.insertMoney(5)).isEqualTo("Money accepted");
        assertThat(vendingMachine.insertMoney(5)).isEqualTo("Money accepted");
        assertThat(vendingMachine.dispenseProduct()).isEqualTo("Dispensing product and change 0");
        assertThat(vendingMachine.insertMoney(20)).isEqualTo("Cannot accept money - items sold out");
    }
}
