package com.truongnd.behavioral.observer;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.behavioral.observer
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:34
 */
public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}
