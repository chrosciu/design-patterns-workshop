package eu.chrost.patterns.behavioral.command;

import lombok.RequiredArgsConstructor;

import static eu.chrost.patterns.behavioral.command.BaseCommand.State.AFTER_EXECUTION;
import static eu.chrost.patterns.behavioral.command.BaseCommand.State.AFTER_UNDO;
import static eu.chrost.patterns.behavioral.command.BaseCommand.State.BEFORE_EXECUTION;

@RequiredArgsConstructor
abstract class BaseCommand implements Command {

    enum State {
        BEFORE_EXECUTION,
        AFTER_EXECUTION,
        AFTER_UNDO
    }

    protected final TextBuffer textBuffer;
    private String backup = "";
    private State state = BEFORE_EXECUTION;

    protected abstract void executeCommand();

    @Override
    public void execute() {
        switch (state) {
            case BEFORE_EXECUTION -> {
                backup = textBuffer.getText();
                executeCommand();
                state = AFTER_EXECUTION;
            }
            case AFTER_EXECUTION, AFTER_UNDO -> throw new IllegalStateException("Cannot execute command twice !");
        }
    }

    @Override
    public void undo() {
        switch (state) {
            case BEFORE_EXECUTION -> throw new IllegalStateException("Cannot undo not executed command!");
            case AFTER_EXECUTION -> {
                textBuffer.setText(backup);
                state = AFTER_UNDO;
            }
            case AFTER_UNDO -> throw new IllegalStateException("Cannot undo command twice!");
        }
    }
}
