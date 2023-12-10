package eu.chrost.patterns.structural.flyweight;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class Ball {
    private final double x;
    private final double y;
    private final Background background;
}
