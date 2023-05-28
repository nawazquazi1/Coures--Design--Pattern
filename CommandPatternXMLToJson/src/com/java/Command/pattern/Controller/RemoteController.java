package com.java.Command.pattern.Controller;

import com.java.Command.pattern.command.Command;

public class RemoteController {
    Command command;
    public RemoteController(Command command){
        this.command=command;
    }
 public    void setCommand (Command command){
        this.command=command;
    }
   public void pressButton(){
        command.execute();
    }
}
