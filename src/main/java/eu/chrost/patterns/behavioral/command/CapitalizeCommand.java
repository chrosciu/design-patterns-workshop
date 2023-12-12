package eu.chrost.patterns.behavioral.command;

class CapitalizeCommand extends BaseCommand {
    public CapitalizeCommand(TextBuffer textBuffer) {
        super(textBuffer);
    }

    @Override
    protected void executeCommand() {
        textBuffer.setText(textBuffer.getText().toUpperCase());
    }
}
