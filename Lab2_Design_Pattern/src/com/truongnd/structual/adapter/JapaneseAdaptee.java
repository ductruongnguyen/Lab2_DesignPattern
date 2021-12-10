package com.truongnd.structual.adapter;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.structual.adapter
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:20
 */
public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}
