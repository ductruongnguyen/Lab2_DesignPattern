package com.truongnd.creational.singleton;

import java.util.Date;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational
 * <p>
 * This is the First
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:46
 */
public class Util {

    private static final Util INSTANCE = new Util();

    public static Util getInstance() {
        return INSTANCE;
    }

    public void printCurrentDateTime() {
        System.out.println(new Date());
    }
}