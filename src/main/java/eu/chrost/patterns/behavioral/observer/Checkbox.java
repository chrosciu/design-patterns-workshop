package eu.chrost.patterns.behavioral.observer;

import lombok.Getter;

class Checkbox extends AbstractPublisher implements Subscriber {
    @Getter
    private boolean checked = false;

    public void setChecked(boolean checked) {
        this.checked = checked;
        notifyAllSubscribers(new CheckboxChangeEvent(this));
    }

    @Override
    public void notify(Object event) {
        if (event instanceof ButtonSubmitEvent) {
            this.checked = false;
        }
    }
}
