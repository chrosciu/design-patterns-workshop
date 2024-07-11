package eu.chrost.patterns.behavioral.mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class FormMediator implements Mediator {
    private final Checkbox checkbox;
    private final Input input;
    private final Button button;

    @Override
    public void notify(Event<?> event) {
        if (event instanceof CheckboxChangeEvent cce && cce.getSource() == checkbox) {
            button.setEnabled(!checkbox.isChecked() || !input.getText().isBlank());
        }
    }
}
