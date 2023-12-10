package eu.chrost.patterns.creational.factorymethod;

import java.util.Arrays;
import java.util.stream.Collectors;

class NodeCreator {
    public Node createTextNode(String text) {
        return new TextNodeFactory(text).create();
    }

    public Node createHtmlNode(String tagName, Node... subNodes) {
        return new HtmlNodeFactory(
                tagName, Arrays.stream(subNodes).collect(Collectors.toUnmodifiableList())
        ).create();
    }
}
