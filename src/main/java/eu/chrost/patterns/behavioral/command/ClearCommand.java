package eu.chrost.patterns.behavioral.command;

class ClearCommand extends BaseCommand {
    public ClearCommand(TextBuffer textBuffer) {
        super(textBuffer);
    }

    @Override
    protected void executeCommand() {
        textBuffer.setText("");
    }
}
