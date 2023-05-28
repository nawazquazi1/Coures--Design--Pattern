public class Main {
    public static void main(String[] args) {
        TubeLight tubeLight=new TubeLight();
        TubeLightOnCommand tubeLightOnCommand=new TubeLightOnCommand(tubeLight);
        RemoteController remoteController=new RemoteController(tubeLightOnCommand);
        remoteController.PressButton();

        remoteController.setCommand(new TubeLightOffCommand(tubeLight));
        remoteController.PressButton();
    }
}
