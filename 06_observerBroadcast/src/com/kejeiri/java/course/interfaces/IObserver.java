package com.kejeiri.java.course.interfaces;

public interface IObserver {
    void attachTo(ITopic topic);
    void deattach();
    void newTopic(String message);
}
