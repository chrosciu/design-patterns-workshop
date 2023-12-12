package eu.chrost.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

class AbstractPublisher {
    private final Set<Subscriber> subscribers = new HashSet<>();

    void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    void notifyAllSubscribers(Object event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(event);
        }
    }
}
