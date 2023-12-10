package eu.chrost.patterns.structural.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class HtmlTree {
    private final HtmlNode root;

    public String renderContentAsString() {
        return root.renderContentAsString();
    }
}
