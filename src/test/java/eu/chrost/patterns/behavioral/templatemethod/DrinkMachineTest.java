package eu.chrost.patterns.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.COFFEE;
import static eu.chrost.patterns.behavioral.templatemethod.DrinkMachine.Granulate.TEA;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;

public class DrinkMachineTest {
    //given
    private final DrinkMachine drinkMachine = spy(new DrinkMachine());

    @Test
    void shouldMakeTea() {
        //when
        drinkMachine.makeTea();

        //then
        var orderVerifier = inOrder(drinkMachine);
        orderVerifier.verify(drinkMachine).boilWater();
        orderVerifier.verify(drinkMachine).addGranulate(TEA);
        orderVerifier.verify(drinkMachine).addSugar(2);
        orderVerifier.verify(drinkMachine).pourDrink(250);
        orderVerifier.verifyNoMoreInteractions();
    }

    @Test
    void shouldMakeBitterTea() {
        //when
        drinkMachine.makeBitterTea();

        //then
        var orderVerifier = inOrder(drinkMachine);
        orderVerifier.verify(drinkMachine).boilWater();
        orderVerifier.verify(drinkMachine).addGranulate(TEA);
        orderVerifier.verify(drinkMachine, never()).addSugar(anyInt());
        orderVerifier.verify(drinkMachine).pourDrink(250);
        orderVerifier.verifyNoMoreInteractions();
    }

    @Test
    void shouldMakeSmallCoffee() {
        //when
        drinkMachine.makeDrink(new SmallCoffee(drinkMachine));

        //then
        var orderVerifier = inOrder(drinkMachine);
        orderVerifier.verify(drinkMachine).boilWater();
        orderVerifier.verify(drinkMachine).addGranulate(COFFEE);
        orderVerifier.verify(drinkMachine, never()).addSugar(anyInt());
        orderVerifier.verify(drinkMachine).pourDrink(150);
        orderVerifier.verifyNoMoreInteractions();
    }

    @Test
    void shouldMakeCoffee() {
        //when
        drinkMachine.makeDrink(new Coffee(drinkMachine));

        //then
        var orderVerifier = inOrder(drinkMachine);
        orderVerifier.verify(drinkMachine).boilWater();
        orderVerifier.verify(drinkMachine).addGranulate(COFFEE);
        orderVerifier.verify(drinkMachine, never()).addSugar(anyInt());
        orderVerifier.verify(drinkMachine).pourDrink(250);
        orderVerifier.verifyNoMoreInteractions();
    }
}
