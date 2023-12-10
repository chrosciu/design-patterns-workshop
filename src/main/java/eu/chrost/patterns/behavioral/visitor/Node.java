package eu.chrost.patterns.behavioral.visitor;

interface Node {
    void accept(NodeVisitor nodeVisitor);
}
