package eu.chrost.patterns.behavioral.command;

class TextEditor {
    private final TextBuffer textBuffer = new TextBuffer();

    void appendText(String text) {
        textBuffer.setText(textBuffer.getText() + text);
    }

    void clearText() {
        Command command = new ClearCommand(textBuffer);
        command.execute();
    }

    void capitalizeText() {
        textBuffer.setText(textBuffer.getText().toUpperCase());
    }

    void undo() {
        //TODO: Implement
    }

    String getText() {
        return textBuffer.getText();
    }
}
