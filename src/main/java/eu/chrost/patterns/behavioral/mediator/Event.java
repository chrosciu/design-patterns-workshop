package eu.chrost.patterns.behavioral.mediator;

interface Event<T> {
    T getSource();
}
