package com.truongnd.structual.adapter;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.structual.adapter
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:21
 */
public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
