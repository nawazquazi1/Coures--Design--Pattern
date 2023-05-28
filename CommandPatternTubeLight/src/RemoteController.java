public class RemoteController {
    Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    void setCommand(Command command) {
        this.command = command;
    }

    void PressButton() {
        command.execute();
    }

}
