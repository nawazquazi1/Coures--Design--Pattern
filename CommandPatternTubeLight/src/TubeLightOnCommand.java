public class TubeLightOnCommand implements Command {

    public TubeLightOnCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    TubeLight tubeLight;

    @Override
    public void execute() {
        tubeLight.switchOn();
    }
}
