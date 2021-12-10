package com.truongnd.behavioral.observer;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.behavioral.observer
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:33
 */
public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}
