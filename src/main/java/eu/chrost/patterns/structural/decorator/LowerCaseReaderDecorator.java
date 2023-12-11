package eu.chrost.patterns.structural.decorator;

class LowerCaseReaderDecorator extends ReaderDecorator {
    public LowerCaseReaderDecorator(Reader reader) {
        super(reader);
    }

    @Override
    public String getText() {
        return reader.getText().toLowerCase();
    }
}
