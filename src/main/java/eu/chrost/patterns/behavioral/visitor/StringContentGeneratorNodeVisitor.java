package eu.chrost.patterns.behavioral.visitor;

class StringContentGeneratorNodeVisitor implements NodeVisitor {
    private final StringBuilder content = new StringBuilder();

    public String getContent() {
        return content.toString();
    }

    @Override
    public void visit(Node node) {
        if (node instanceof TextNode textNode) {
            content.append(textNode.getText());
        } else if (node instanceof HtmlNode htmlNode) {
            content.append("<");
            content.append(htmlNode.getTagName());
            content.append(">");

            for (var subNode: htmlNode.getSubNodes()) {
                this.visit(subNode);
            }

            content.append("</");
            content.append(htmlNode.getTagName());
            content.append(">");
        }
    }
}
