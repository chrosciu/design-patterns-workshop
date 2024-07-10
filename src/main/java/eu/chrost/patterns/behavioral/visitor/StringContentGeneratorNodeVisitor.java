package eu.chrost.patterns.behavioral.visitor;

class StringContentGeneratorNodeVisitor implements NodeVisitor {
    private final StringBuilder content = new StringBuilder();

    public String getContent() {
        return content.toString();
    }

    @Override
    public void visit(TextNode textNode) {
        content.append(textNode.getText());
    }

    @Override
    public void visit(HtmlNode htmlNode) {
        content.append("<");
        content.append(htmlNode.getTagName());
        content.append(">");

        for (var subNode: htmlNode.getSubNodes()) {
            subNode.accept(this);
        }

        content.append("</");
        content.append(htmlNode.getTagName());
        content.append(">");
    }
}
