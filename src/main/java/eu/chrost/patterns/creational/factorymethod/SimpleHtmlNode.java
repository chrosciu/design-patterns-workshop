package eu.chrost.patterns.creational.factorymethod;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class SimpleHtmlNode implements Node {
    private final String tagName;

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(tagName);
        stringBuilder.append(">");
        stringBuilder.append("</");
        stringBuilder.append(tagName);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
