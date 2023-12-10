package eu.chrost.patterns.creational.factorymethod;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class TextNode implements Node {
    private final String text;

    @Override
    public String toString() {
        return text;
    }
}
