package eu.chrost.patterns.behavioral.chain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class Bug {
    private final Severity severity;
}
