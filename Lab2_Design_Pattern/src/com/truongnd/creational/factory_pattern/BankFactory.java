package com.truongnd.creational.factory_pattern;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.factory_pattern
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:08
 */
public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {

            case TPBANK:
                return new TPBank();

            case VIETCOMBANK:
                return new VietcomBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
