package eu.chrost.patterns.creational.factorymethod;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class HtmlNodeFactory extends NodeFactory {
    private final String tagName;
    private final List<Node> subNodes;

    @Override
    public Node create() {
        if (null == subNodes || subNodes.isEmpty()) {
            return new SimpleHtmlNode(tagName);
        }
        var htmlNode =  new HtmlNode(tagName);
        htmlNode.addSubNodes(subNodes.toArray(new Node[0]));
        return htmlNode;
    }
}
