package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for (Integer[] a: array) {
            list.addAll(Arrays.asList(a));
        }
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> list = new ArrayList<>();
        for (Integer[] a: array) {
            for (Integer i : a) {
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
