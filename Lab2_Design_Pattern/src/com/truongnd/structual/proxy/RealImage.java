package com.truongnd.structual.proxy;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.structual.proxy
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:25
 */
public class RealImage implements Image {
    private String url;

    public RealImage(String url) {
        this.url = url;
        System.out.println("Image loaded: " + this.url);
    }

    @Override
    public void showImage() {
        System.out.println("Image showed: " + this.url);
    }

}
