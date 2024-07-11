package eu.chrost.patterns.behavioral.observer;

import lombok.Getter;
import lombok.Setter;

class Button implements Subscriber {
    @Setter
    private Input input;
    @Getter
    private boolean enabled = true;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void submit() {
        if (!enabled) {
            return;
        }
        input.setText("");
    }

    @Override
    public void notify(Object event) {
        if (event instanceof CheckboxChangeEvent cce) {
            Checkbox checkbox = cce.getCheckbox();
            this.enabled = !checkbox.isChecked() || !input.getText().isBlank();
        }
    }
}
