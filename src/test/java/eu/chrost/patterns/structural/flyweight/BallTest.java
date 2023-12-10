package eu.chrost.patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BallTest {
    @Test
    void memoryFootprintShouldBeMinimized() {
        //when
        var ball1 = new Ball(0, 0, new Background("Background One".getBytes()));
        var ball2 = new Ball(1, 2, new Background("Background One".getBytes()));
        var ball3 = new Ball(3, 2, new Background("Background One".getBytes()));
        var ball4 = new Ball(4, 6, new Background("Background One".getBytes()));
        var ball5 = new Ball(5, 6, new Background("Background Two".getBytes()));
        var ball6 = new Ball(-1, -2, new Background("Background One".getBytes()));
        var ball7 = new Ball(-1, 4, new Background("Background One".getBytes()));
        var ball8 = new Ball(2,-5, new Background("Background Two".getBytes()));
        var ball9 = new Ball(-3, -5, new Background("Background One".getBytes()));
        var ball10 = new Ball(7, 8, new Background("Background One".getBytes()));

        //then
        assertThat(Background.getCount()).isEqualTo(10);
    }
}
