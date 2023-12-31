package eu.chrost.patterns.behavioral.strategy;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class Point {
    int x;
    int y;

    public double distanceTo(@NonNull Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2.0) + Math.pow(p.y - y, 2.0));
    }
}
