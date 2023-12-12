package eu.chrost.patterns.behavioral.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class InputChangeEvent implements Event<Input> {
    private final Input source;
}
