package com.truongnd.creational.abstract_factory;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.abstract_factory
 * <p>
 * This is the FurnitureAbstractFactory
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:51
 */
public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
