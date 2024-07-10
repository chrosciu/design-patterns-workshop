package eu.chrost.patterns.creational.factory;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class TextNode implements Node {
    private final String text;

    @Override
    public String toString() {
        return text;
    }
}
