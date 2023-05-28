package com.java.coures.Factory;

import com.java.coures.InterFace.Mobile;
import com.java.coures.mobile.IPhone;
import com.java.coures.mobile.OnePlusPhone;
import com.java.coures.mobile.RealMe;

import java.sql.DataTruncation;

public class MobileFactory {
    public Mobile crateMobile(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        } else if ("IPHONE".equals(s)) {
            return new IPhone();
        } else if ("ONE-PLUS".equals(s)) {
            return new OnePlusPhone();
        } else if ("REALM".equals(s)) {
            return new RealMe();
        } else {
            return null;
        }
    }
}
