package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        int interval = random.nextInt(3);

        List<Integer> list = new ArrayList<>();
        for (int i = 9; i >= 0;) {
            i -= interval;
            if (i >= 0) {
                list.add(i);
            }
        }

        return list;
    }
}
