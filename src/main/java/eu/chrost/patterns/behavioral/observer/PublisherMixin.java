package eu.chrost.patterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

class PublisherMixin {
    private final Set<Subscriber> subscribers = new HashSet<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifyAllSubscribers(Object event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(event);
        }
    }
}
