package eu.chrost.patterns.behavioral.command;

interface Command {
    void execute();
    void undo();
}
