package eu.chrost.patterns.creational.factory;

class NodeFactory {
    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    public HtmlNode createHtmlNode(String tagName, Node... subNodes) {
        var htmlNode = new HtmlNode(tagName);
        htmlNode.addSubNodes(subNodes);
        return htmlNode;
    }
}
