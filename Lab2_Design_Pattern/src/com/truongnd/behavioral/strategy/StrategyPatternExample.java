package com.truongnd.behavioral.strategy;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.behavioral.strategy
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:40
 */
public class StrategyPatternExample {
    public static void main(String[] args) {

        SortedList sortedList = new SortedList();
        sortedList.add("Java Core");
        sortedList.add("Java Design Pattern");
        sortedList.add("Java Library");
        sortedList.add("Java Framework");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
