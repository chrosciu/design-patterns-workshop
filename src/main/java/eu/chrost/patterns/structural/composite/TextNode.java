package eu.chrost.patterns.structural.composite;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class TextNode implements Node {
    private final String text;
}
