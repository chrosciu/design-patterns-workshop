package eu.chrost.patterns.behavioral.command;

import java.util.Stack;

class TextEditor {
    private final TextBuffer textBuffer = new TextBuffer();
    private final Stack<Command> commandsHistory = new Stack<>();

    void appendText(String text) {
        executeCommand(new AppendCommand(textBuffer, text));
    }

    void clearText() {
        executeCommand(new ClearCommand(textBuffer));
    }

    void capitalizeText() {
        executeCommand(new CapitalizeCommand(textBuffer));
    }

    private void executeCommand(Command command) {
        command.execute();
        commandsHistory.push(command);
    }

    void undo() {
        var lastCommand = commandsHistory.pop();
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }

    String getText() {
        return textBuffer.getText();
    }
}
