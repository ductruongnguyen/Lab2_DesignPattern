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
public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank

        Bank bank2 = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank2.getBankName());
    }
}
