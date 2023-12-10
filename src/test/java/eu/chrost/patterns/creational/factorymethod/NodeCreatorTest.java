package eu.chrost.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NodeCreatorTest {
    private NodeCreator nodeCreator = new NodeCreator();

    @Test
    void shouldCreateSimpleHtmlNode() {
        //when
        var htmlNode = nodeCreator.createHtmlNode("p");

        //then
        assertThat(htmlNode.toString()).isEqualTo("<p></p>");
        assertThat(htmlNode).isInstanceOf(SimpleHtmlNode.class);
    }

    @Test
    void shouldCreateComplexHtmlNodes() {
        //when
        var textNode1 = nodeCreator.createTextNode("baz");
        var paragraph1 = nodeCreator.createHtmlNode("p", textNode1);

        var textNode2 = nodeCreator.createTextNode("bar");
        var paragraph2 = nodeCreator.createHtmlNode("p");
        var div = nodeCreator.createHtmlNode("div", textNode2, paragraph1, paragraph2);

        var textNode3 = nodeCreator.createTextNode("foo");
        var rootNode = nodeCreator.createHtmlNode("document", textNode3, div);

        //then
        assertThat(rootNode.toString()).isEqualTo("<document>foo<div>bar<p>baz</p><p></p></div></document>");
        assertThat(rootNode).isInstanceOf(HtmlNode.class);
    }

    @Test
    void shouldCreateTextNode() {
        //when
        var textNode = nodeCreator.createTextNode("Bar");

        //then
        assertThat(textNode.toString()).isEqualTo("Bar");
        assertThat(textNode).isInstanceOf(TextNode.class);
    }
}
