package com.truongnd.creational.builder;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.creational.builder
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:12
 */
public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(Order.OrderType.ON_SITE).orderBread(Order.BreadType.OMELETTE)
                .orderSauce(Order.SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
