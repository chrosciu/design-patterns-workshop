package eu.chrost.patterns.creational.factorymethod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class TextNodeFactory extends NodeFactory {
    private final String text;

    @Override
    public Node create() {
        return new TextNode(text);
    }
}
