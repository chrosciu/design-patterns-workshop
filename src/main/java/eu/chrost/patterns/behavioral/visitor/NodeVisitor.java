package eu.chrost.patterns.behavioral.visitor;

interface NodeVisitor {
    void visit(TextNode textNode);
    void visit(HtmlNode htmlNode);
}
