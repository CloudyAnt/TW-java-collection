package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<>();
        for (Integer i :
                array) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<>();
        for (Integer i :
                array) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<>();

        for (int item : firstList) {
            for (int value : secondList) {
                if (item == value) {
                    list.add(item);
                    break;
                }
            }
        }

        return list;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> list = new ArrayList<>();
        for (Integer i :
                array) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}