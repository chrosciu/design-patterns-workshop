package eu.chrost.patterns.behavioral.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class CheckboxChangeEvent implements Event<Checkbox> {
    private final Checkbox source;
}
