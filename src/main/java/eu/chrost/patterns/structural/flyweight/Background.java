package eu.chrost.patterns.structural.flyweight;

import lombok.Getter;

import java.util.List;

@Getter
class Background {
    private final List<Byte> data;
    @Getter
    private static int count = 0;

    public Background(List<Byte> data) {
        this.data = List.copyOf(data);
        ++count;
    }
}
