package eu.chrost.patterns.behavioral.command;

import java.util.Stack;

class TextEditor {
    private final TextBuffer textBuffer = new TextBuffer();
    private final Stack<Command> commandsHistory = new Stack<>();

    void appendText(String text) {
        textBuffer.setText(textBuffer.getText() + text);
    }

    void clearText() {
        Command command = new ClearCommand(textBuffer);
        command.execute();
        commandsHistory.push(command);
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
