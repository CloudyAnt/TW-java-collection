package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();

        if (left > right) {
            for (int i = left; i >= right; i--) {
                list.add(i);
            }
        } else {
            for (int i = left; i <= right; i ++) {
                list.add(i);
            }
        }

        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();

        if (left > right) {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        } else {
            for (int i = left; i <= right; i ++) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        }

        return list;
    }

    public List<Integer> popEvenElments(int[] array) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= array.length - 1; i ++) {
            if (array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }

        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list = new ArrayList<>();

        for (int item : firstArray) {
            for (int value : secondArray) {
                if (item == value) {
                    list.add(item);
                    break;
                }
            }
        }

        return list;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> list = new ArrayList<>();
        Integer[] secondClone = secondArray.clone();

        for (int item : firstArray) {
            for (int i = 0; i < secondClone.length; i++) {
                if (item == secondClone[i]) {
                    secondClone[i] = -1;
                    break;
                }
            }
            list.add(item);
        }

        for (int item : secondClone){
            if (item >= 0) {
                list.add(item);
            }
        }

        return list;
    }
}
