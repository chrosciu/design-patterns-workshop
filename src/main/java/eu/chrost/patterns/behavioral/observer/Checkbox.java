package eu.chrost.patterns.behavioral.observer;

import lombok.Getter;
import lombok.Setter;

class Checkbox extends AbstractPublisher {
    @Getter
    private boolean checked = false;

    public void setChecked(boolean checked) {
        this.checked = checked;
        notifyAllSubscribers(new CheckboxChangeEvent(this));
    }
}
