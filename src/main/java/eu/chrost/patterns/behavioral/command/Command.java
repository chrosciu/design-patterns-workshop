package eu.chrost.patterns.behavioral.command;

public interface Command {
    void execute();
    void undo();
}
