package eu.chrost.patterns.behavioral.visitor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class HtmlTree {
    private final HtmlNode root;

    public String renderContentAsString() {
        var visitor = new StringContentGeneratorNodeVisitor();
        visitor.visit(root);
        return visitor.getContent();
    }
}
