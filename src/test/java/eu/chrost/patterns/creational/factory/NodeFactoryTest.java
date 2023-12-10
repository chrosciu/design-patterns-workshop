package eu.chrost.patterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NodeFactoryTest {
    private NodeFactory nodeFactory = new NodeFactory();

    @Test
    void shouldCreateSimpleHtmlNode() {
        //when
        var htmlNode = nodeFactory.createHtmlNode("p");

        //then
        assertThat(htmlNode.toString()).isEqualTo("<p></p>");
    }

    @Test
    void shouldCreateComplexHtmlNodes() {
        //when
        var textNode1 = nodeFactory.createTextNode("baz");
        var paragraph1 = nodeFactory.createHtmlNode("p", textNode1);

        var textNode2 = nodeFactory.createTextNode("bar");
        var paragraph2 = nodeFactory.createHtmlNode("p");
        var div = nodeFactory.createHtmlNode("div", textNode2, paragraph1, paragraph2);

        var textNode3 = nodeFactory.createTextNode("foo");
        var rootNode = nodeFactory.createHtmlNode("document", textNode3, div);

        //then
        assertThat(rootNode.toString()).isEqualTo("<document>foo<div>bar<p>baz</p><p></p></div></document>");
    }

    @Test
    void shouldCreateTextNode() {
        //when
        var textNode = nodeFactory.createTextNode("Bar");

        //then
        assertThat(textNode.toString()).isEqualTo("Bar");
    }
}
