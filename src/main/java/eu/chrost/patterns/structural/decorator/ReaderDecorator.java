package eu.chrost.patterns.structural.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract class ReaderDecorator implements Reader {
    protected final Reader reader;
}
