package eu.chrost.patterns.behavioral.observer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class ButtonSubmitEvent {
    private final Button button;
}
