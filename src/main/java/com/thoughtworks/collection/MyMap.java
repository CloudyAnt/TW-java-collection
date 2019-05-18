package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> list = new ArrayList<>();
        for (Integer i :
                array) {
            list.add(i * 3);
        }
        return list;
    }

    public List<String> mapLetter() {
        List<String> list = new ArrayList<>();
        for (Integer i : array) {
            list.add(toChar(i) + "");
        }
        return list;
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<>();

        for (Integer i : array) {
            StringBuilder str = new StringBuilder();
            while (i > 0) {
                int reminder = i % 26;
                i = i / 26;

                if (reminder == 0) {
                    reminder = 26;
                    i -= 1;
                }

                str.insert(0, toChar(reminder));

            }
            list.add(str.toString());
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        Integer[] sortedArray = new Add().bubbleSort(array);
        List<Integer> list = new ArrayList<>();

        for (int i = sortedArray.length - 1; i >=0 ; i--) {
            list.add(sortedArray[i]);
        }

        return list;
    }

    public List<Integer> sortFromSmall() {
        Integer[] sortedArray = new Add().bubbleSort(array);
        return new ArrayList<>(Arrays.asList(sortedArray));
    }

    private char toChar(Integer integer) {
        if (integer < 1)
            return 0;
        return (char)('a' + (integer - 1));
    }
}
