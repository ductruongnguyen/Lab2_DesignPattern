package com.truongnd.behavioral.observer;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.behavioral.observer
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:31
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}
