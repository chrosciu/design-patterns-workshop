package eu.chrost.patterns.structural.decorator;

class UnderscoreReaderDecorator extends ReaderDecorator {
    public UnderscoreReaderDecorator(Reader reader) {
        super(reader);
    }

    @Override
    public String getText() {
        return reader.getText().replaceAll("\\s", "_");
    }
}
