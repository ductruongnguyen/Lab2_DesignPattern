package com.truongnd.creational.builder;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.builder
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:11
 */
public class FastFoodOrderBuilder implements OrderBuilder {
    private Order.OrderType orderType;
    private Order.BreadType breadType;
    private Order.SauceType sauceType;
    private Order.VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(Order.OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(Order.BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(Order.SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(Order.VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
