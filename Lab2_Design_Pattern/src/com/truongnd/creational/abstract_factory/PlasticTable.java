package com.truongnd.creational.abstract_factory;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.abstract_factory
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:53
 */
public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Create a plastic Table");
    }
}
