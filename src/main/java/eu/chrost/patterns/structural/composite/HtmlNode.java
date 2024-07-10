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
        //TODO: Implement
        var sb = new StringBuilder();
        //render opening tag e.g. <div>
        sb.append("<" + tagName + ">");
        //iterate through sub nodes and append what they render
        //render closing tag </div>
        return sb.toString();
    }
}
