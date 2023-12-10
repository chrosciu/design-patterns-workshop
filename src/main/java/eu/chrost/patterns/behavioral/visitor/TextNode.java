package eu.chrost.patterns.behavioral.visitor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class TextNode implements Node {
    private final String text;
}
