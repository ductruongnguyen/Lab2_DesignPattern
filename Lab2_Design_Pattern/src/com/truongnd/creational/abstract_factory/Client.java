package com.truongnd.creational.abstract_factory;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.abstract_factory
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 17:58
 */
public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}
