package eu.chrost.patterns.behavioral.observer;

import lombok.Getter;
import lombok.experimental.Delegate;

class Button implements Subscriber {
    @Delegate
    private final PublisherMixin publisherMixin = new PublisherMixin();
    @Getter
    private boolean enabled = true;
    private boolean checkboxChecked = false;
    private String inputText = "";

    public void submit() {
        if (!enabled) {
            return;
        }
        notifyAllSubscribers(new ButtonSubmitEvent(this));
    }

    @Override
    public void notify(Object event) {
        if (event instanceof CheckboxChangeEvent checkboxChangeEvent) {
            this.checkboxChecked = checkboxChangeEvent.getCheckbox().isChecked();
            this.enabled = !checkboxChecked || !inputText.isBlank();
        } else if (event instanceof InputChangeEvent inputChangeEvent) {
            this.inputText = inputChangeEvent.getInput().getText();
            this.enabled = !checkboxChecked || !inputText.isBlank();
        }
    }
}
