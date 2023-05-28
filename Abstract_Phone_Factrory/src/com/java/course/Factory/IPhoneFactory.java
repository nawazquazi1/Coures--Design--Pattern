package com.java.course.Factory;

import com.java.course.core.Phone;
import com.java.course.core.PhoneStore;
import com.java.course.model.IPhone12;
import com.java.course.model.IPhone13;

public class IPhoneFactory extends PhoneStore {
    @Override
    protected Phone createPhone(String modelName) {
        if (modelName.equals("IPhone12")){
            return new IPhone12();
        }else if (modelName.equals("IPhone13")){
            return new IPhone13();
        }
        return null;
    }
}
