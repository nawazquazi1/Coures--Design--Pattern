package com.java.Command.pattern.actions;

import com.java.Command.pattern.command.Command;
import com.java.Command.pattern.Model.TubeLight;

public class TubeLightOnCommand implements Command {
    TubeLight tubeLight;

    public TubeLightOnCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.switchOn();
    }
}
