package com.java.course.core;

import java.nio.channels.Pipe;

public abstract class PhoneStore {
    public Phone orderPhone(String modelName){
        Phone phone;
        phone=createPhone(modelName);
        phone.buildPhone();
        phone.assemblePhone();
        phone.packPhoneInBox();
        return phone;
    }
    protected abstract Phone createPhone(String modelName);
}
