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
public class Protector implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getEmail() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}
