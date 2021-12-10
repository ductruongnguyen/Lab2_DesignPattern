package com.truongnd.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.behavioral.strategy
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:39
 */
public class SortedList {
    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        strategy.sort(items);
    }
}
