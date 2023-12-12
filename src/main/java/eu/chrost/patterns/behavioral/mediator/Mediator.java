package eu.chrost.patterns.behavioral.mediator;

interface Mediator {
    void notify(Event<?> event);
}
