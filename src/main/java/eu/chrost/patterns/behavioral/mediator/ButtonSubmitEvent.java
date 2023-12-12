package eu.chrost.patterns.behavioral.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class ButtonSubmitEvent implements Event<Button> {
    private final Button source;
}
