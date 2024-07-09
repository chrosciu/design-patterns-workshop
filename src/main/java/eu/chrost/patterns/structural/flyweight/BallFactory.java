package eu.chrost.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class BallFactory {
    private final Set<Background> backgrounds = new HashSet<>();

    public Ball createBall(double x, double y, List<Byte> data) {
        Background background = getOrCreateBackground(data);
        return new Ball(x, y, background);
    }

    private Background getOrCreateBackground(List<Byte> data) {
        Background background = backgrounds.stream()
                .filter(b -> b.getData().equals(data))
                .findFirst()
                .orElse(null);
        if (background == null) {
            background = new Background(data);
            backgrounds.add(background);
        }
        return background;
    }
}
