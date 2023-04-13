package com.anjg.stringSorter.sorterService;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSorterService {
    private static final Comparator<String> compareAlphabetically = Comparator.comparing(s -> s, String.CASE_INSENSITIVE_ORDER);

    private static final Comparator<String> compareLength = Comparator.comparing(String::length);

    private static final Comparator<String> fullCompare = compareLength.thenComparing(compareAlphabetically);

    public static List<String> sort(String[] input) {
        return Arrays.stream(input)
                .sorted(fullCompare)
                .collect(Collectors.toList());
    }

    public static String[] quickSort(String[] input) {
        quickSort(input, 0, input.length - 1);

        return input;
    }

    static void quickSort(String[] input, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(input, left, right);
            quickSort(input, left, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, right);
        }
    }

    public static int partition(String[] input, int left, int right) {
        String pivot = input[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (input[j].length() < pivot.length() ||
                    (input[j].length() == pivot.length() &&
                            input[j].compareToIgnoreCase(pivot) <= 0)) {
                i++;
                swap(input, i, j);
            }
        }
        swap(input, i+1, right);
        return i + 1;
    }

    private static void swap(String[] array, int index1, int index2){
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
