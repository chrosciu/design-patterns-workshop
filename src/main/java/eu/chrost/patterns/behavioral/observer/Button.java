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
        //checkbox.setChecked(false);
        input.setText("");
    }

    @Override
    public void notify(Object event) {
        if (event instanceof CheckboxChangeEvent) {
            CheckboxChangeEvent checkboxChangeEvent = (CheckboxChangeEvent) event;
            Checkbox checkbox = checkboxChangeEvent.getCheckbox();
            this.enabled = !checkbox.isChecked() || !input.getText().isBlank();
        }
    }
}
