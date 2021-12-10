package com.truongnd.creational.factory_pattern;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.factory_pattern
 * <p>
 * Day la Concrete Class cua thang Bank
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:06
 */
public class TPBank implements Bank {

    @Override
    public String getBankName() {
        return "TPBANK";
    }
}
