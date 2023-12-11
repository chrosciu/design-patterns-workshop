package eu.chrost.patterns.structural.composite;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HtmlNode implements Node {
    @Getter
    private final String tagName;
    private List<Node> subNodes = new ArrayList<>();

    public HtmlNode(String tagName) {
        this.tagName = tagName;
    }

    public void addSubNodes(Node... nodes) {
        subNodes.addAll(Arrays.asList(nodes));
    }

    public List<Node> getSubNodes() {
        return Collections.unmodifiableList(subNodes);
    }

    @Override
    public String renderContentAsString() {
        var content = new StringBuilder();
        //render opening tag
        content.append("<");
        content.append(tagName);
        content.append(">");

        //render sub nodes
        for (Node node : subNodes) {
            content.append(node.renderContentAsString());
        }

        //render closing tag
        content.append("</");
        content.append(tagName);
        content.append(">");

        return content.toString();
    }
}
