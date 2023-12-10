package eu.chrost.patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class BallTest {
    private final BallFactory ballFactory = new BallFactory();
    
    @Test
    void memoryFootprintShouldBeMinimized() {
        //when
        var ball1 = ballFactory.createBall(0, 0, toByteList("Background One"));
        var ball2 = ballFactory.createBall(1, 2, toByteList("Background One"));
        var ball3 = ballFactory.createBall(3, 2, toByteList("Background One"));
        var ball4 = ballFactory.createBall(4, 6, toByteList("Background One"));
        var ball5 = ballFactory.createBall(5, 6, toByteList("Background Two"));
        var ball6 = ballFactory.createBall(-1, -2, toByteList("Background One"));
        var ball7 = ballFactory.createBall(-1, 4, toByteList("Background One"));
        var ball8 = ballFactory.createBall(2,-5, toByteList("Background Two"));
        var ball9 = ballFactory.createBall(-3, -5, toByteList("Background One"));
        var ball10 = ballFactory.createBall(7, 8, toByteList("Background One"));

        //then
        assertThat(Background.getCount()).isEqualTo(2);
    }

    private List<Byte> toByteList(String input) {
        var bytes = input.getBytes();
        return IntStream.range(0, bytes.length).mapToObj(i -> bytes[i]).collect(Collectors.toList());
    }
}
