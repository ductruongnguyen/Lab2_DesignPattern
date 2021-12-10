package com.truongnd.creational.factory_pattern;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.factory_pattern
 * <p>
 * Day la concrete class thu 2 cua cai Bank
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:07
 */
public class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "VIETCOMBANK";
    }
}
