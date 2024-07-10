package eu.chrost.patterns.structural.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class LowerCaseReaderDecorator implements Reader {
    private final Reader reader;

    @Override
    public String getText() {
        return reader.getText().toLowerCase();
    }
}
