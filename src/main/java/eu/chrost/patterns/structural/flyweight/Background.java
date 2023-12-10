package eu.chrost.patterns.structural.flyweight;

import lombok.Getter;

@Getter
class Background {
    private final byte[] data;
    @Getter
    private static int count = 0;

    public Background(byte[] data) {
        this.data = data;
        ++count;
    }
}
