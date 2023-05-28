package com.java.course.Factory;

import com.java.course.core.Phone;
import com.java.course.core.PhoneStore;
import com.java.course.model.IPhone12;
import com.java.course.model.IPhone13;
import com.java.course.model.OnePlus10T;
import com.java.course.model.OnePlus8;

public class OnePlusFactory extends PhoneStore {

    @Override
    protected Phone createPhone(String modelName) {
        if (modelName.equals("One-Plus 8")) {
            return new OnePlus8();
        } else if (modelName.equals("One-Plus 10 T")) {
            return new OnePlus10T();
        }
        return null;
    }
}
