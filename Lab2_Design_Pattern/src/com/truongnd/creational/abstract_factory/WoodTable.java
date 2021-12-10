package com.truongnd.creational.abstract_factory;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.abstract_factory
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:54
 */
public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Crete a wood table");
    }
}
