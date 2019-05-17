package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }

        int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }

        int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;

        for (Integer i : arrayList) {
            sum += i * 3 + 2;
        }

        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> operatedList = new ArrayList<>();

        for (Integer i : arrayList) {
            if (i % 2 != 0) {
                operatedList.add(i * 3 + 2);
            } else {
                operatedList.add(i);
            }
        }
        return operatedList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (Integer i : arrayList) {
            if (i % 2 != 0) {
                sum += i * 3 + 5;
            }
        }
        return sum;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> operatedList = new ArrayList<>();

        int present = -1;
        for (Integer i : arrayList) {
            if (present != -1) {
                operatedList.add((present + i) * 3);
            }
            present = i;
        }
        return operatedList;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        Integer[] numbers = bubbleSort(arrayList);
        int len = numbers.length;
        if (len % 2 != 0) {
            return numbers[len / 2];
        } else {
            return (numbers[len / 2] + numbers[(len / 2) - 1]) / 2;
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int sum = 0, amount = 0;
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                sum += i;
                amount += 1;
            }
        }
        return sum / amount;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        for (Integer i : arrayList) {
            if (i % 2 == 0 && i.equals(specialElment)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> operatedList = new ArrayList<>();

        for (Integer i : arrayList) {
            if (i % 2 == 0 && !operatedList.contains(i)) {
                operatedList.add(i);
            }
        }
        return operatedList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> events = new ArrayList<>(), odds = new ArrayList<>();

        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                events.add(i);
            } else {
                odds.add(i);
            }
        }

        Integer[] eventsArray = bubbleSort(events), oddsArray = bubbleSort(odds);
        List<Integer> all = new ArrayList<>(Arrays.asList(eventsArray));
        for (int i = oddsArray.length - 1; i > -1; i--) {
            all.add(oddsArray[i]);
        }

        return all;
    }

    private Integer[] bubbleSort(List<Integer> list) {
        Integer[] array = list.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
