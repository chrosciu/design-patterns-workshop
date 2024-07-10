package eu.chrost.patterns.structural.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class UnderscoreReaderDecorator implements Reader {
    private final Reader reader;

    @Override
    public String getText() {
        return reader.getText().replaceAll("\\s", "_");
    }
}
