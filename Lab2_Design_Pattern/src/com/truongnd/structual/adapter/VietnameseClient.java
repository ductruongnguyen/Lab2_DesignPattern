package com.truongnd.structual.adapter;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.structual.adapter
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:22
 */
public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}
