package com.truongnd.behavioral.strategy;

import java.util.List;

/**
 * Project: Lab2_Design_Pattern
 * Package: com.truongnd.behavioral.strategy
 * <p>
 * This is the
 *
 * @Author: truongnd
 * @Date: 10/12/2021
 * @Time: 18:38
 */
public class QuickSort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}
