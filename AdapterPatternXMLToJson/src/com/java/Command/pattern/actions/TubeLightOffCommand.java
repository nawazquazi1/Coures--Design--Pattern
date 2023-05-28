package com.java.Command.pattern.actions;

import com.java.Command.pattern.command.Command;
import com.java.Command.pattern.Model.TubeLight;

public class TubeLightOffCommand implements Command {
    TubeLight tubeLight;

    public TubeLightOffCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.switchOff();
    }
}
