package com.java.course.facade;

import com.java.course.subSystem.RoomLight;
import com.java.course.subSystem.SoundSystem;
import com.java.course.subSystem.Television;

public class HomeTheatre {

    RoomLight roomLight;
    Television television;
    SoundSystem soundSystem;

    public HomeTheatre(RoomLight roomLight, Television television, SoundSystem soundSystem) {
        this.roomLight = roomLight;
        this.television = television;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        soundSystem.switchOnSoundSystem();
        television.switchOn();
        roomLight.lightsDim();
    }

    public void StopWatchMovie() {
        soundSystem.switchOffSoundSystem();
        television.switchOff();
        roomLight.lightsBright();
    }
}
