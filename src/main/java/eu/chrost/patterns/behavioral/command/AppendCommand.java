package eu.chrost.patterns.behavioral.command;

class AppendCommand extends BaseCommand {
    private final String text;
    public AppendCommand(TextBuffer textBuffer, String text) {
        super(textBuffer);
        this.text = text;
    }

    @Override
    protected void executeCommand() {
        textBuffer.setText(textBuffer.getText() + text);
    }
}
