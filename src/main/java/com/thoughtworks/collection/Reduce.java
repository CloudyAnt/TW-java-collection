package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    private List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
       Integer[] array = new Add().bubbleSort(arrayList);
       return array[array.length - 1];
    }

    public double getMinimum() {
        Integer[] array = new Add().bubbleSort(arrayList);
        return array[0];
    }

    public double getAverage() {
        int sum = 0, amount = 0;
        for (Integer i : arrayList) {
            sum += i;
            amount += 1;
        }
        return (double)sum / amount;
    }

    public double getOrderedMedian() {
        Integer[] numbers = new Add().bubbleSort(arrayList);
        int len = numbers.length;
        if (len % 2 != 0) {
            return numbers[len / 2];
        } else {
            return (numbers[len / 2] + numbers[(len / 2) - 1]) / (double)2;
        }
    }

    public int getFirstEven() {
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        Integer[] list = arrayList.toArray(new Integer[0]);
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size())
            return false;
        Add add = new Add();

        Integer[] thisArray = add.bubbleSort(this.arrayList), array = add.bubbleSort(arrayList);
        for (int i = 0; i < array.length; i++) {
            if (!thisArray[i].equals(array[i])) {
                return false;
            }
        }

        return true;
    }

    public Double getMedianInLinkList(SingleLink<Integer> singleLink) {
        int len = arrayList.toArray(new Integer[0]).length;

        if (len % 2 != 0) {
            return (double)(singleLink.getNode(len / 2 + 1));
        } else {
            return ((double)(singleLink.getNode(len / 2) + singleLink.getNode(len / 2 + 1)) / 2);
        }
    }

    public int getLastOdd() {
        int odd = -1;
        for (Integer i : arrayList) {
            if (i % 2 != 0) {
                odd = i;
            }
        }
        return odd;
    }

    public int getIndexOfLastOdd() {
        int index = -1;
        Integer[] list = arrayList.toArray(new Integer[0]);
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 != 0) {
                index = i;
            }
        }
        return index;
    }
}
