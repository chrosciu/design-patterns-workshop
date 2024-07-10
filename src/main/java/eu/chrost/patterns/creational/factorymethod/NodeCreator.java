package eu.chrost.patterns.creational.factorymethod;

import java.util.Arrays;

public class NodeCreator {
    public Node createTextNode(String text) {
        return new TextNodeFactory(text).createNode();
    }

    public Node createHtmlNode(String tagName, Node... subNodes) {
        return new HtmlNodeFactory(tagName, Arrays.stream(subNodes).toList()).createNode();
    }
}
