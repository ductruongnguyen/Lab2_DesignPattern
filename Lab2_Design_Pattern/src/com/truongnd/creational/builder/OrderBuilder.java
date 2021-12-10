package com.truongnd.creational.builder;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.builder
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:10
 */
public interface OrderBuilder {
    OrderBuilder orderType(Order.OrderType orderType);

    OrderBuilder orderBread(Order.BreadType breadType);

    OrderBuilder orderSauce(Order.SauceType sauceType);

    OrderBuilder orderVegetable(Order.VegetableType vegetableType);

    Order build();
}
