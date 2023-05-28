package com.java.Command.pattern;

import com.java.Command.pattern.Controller.RemoteController;
import com.java.Command.pattern.Model.TubeLight;
import com.java.Command.pattern.actions.TubeLightOffCommand;
import com.java.Command.pattern.actions.TubeLightOnCommand;

public class Main {
    public static void main(String[] args) {
        TubeLight tubeLight=new TubeLight();
        TubeLightOnCommand tubeLightOnCommand=new TubeLightOnCommand(tubeLight);
        RemoteController remoteController=new RemoteController(tubeLightOnCommand);
        remoteController.pressButton();


        TubeLightOffCommand tubeLightOffCommand=new TubeLightOffCommand(tubeLight);
        remoteController.setCommand(tubeLightOffCommand);
        remoteController.pressButton();

    }
}
