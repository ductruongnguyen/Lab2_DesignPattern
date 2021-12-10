package com.truongnd.creational.abstract_factory;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.abstract_factory
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:57
 */
public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
