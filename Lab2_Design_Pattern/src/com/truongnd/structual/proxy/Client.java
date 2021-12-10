package com.truongnd.structual.proxy;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.structual.proxy
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:26
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("http://gpcoder.com/favicon.ico");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}
