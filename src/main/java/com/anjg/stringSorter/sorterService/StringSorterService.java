package com.anjg.stringSorter.sorterService;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSorterService {

    // This is a simple function library that does not hold state, so it makes sense for it to be static

    private static Comparator<String> compareAlphabetically = Comparator.comparing(s -> s, String.CASE_INSENSITIVE_ORDER);

    static List<String> sortAlphabetically(String[] input){
        return Arrays.stream(input)
                .sorted(compareAlphabetically)
                .collect(Collectors.toList());
    }

    private static Comparator<String> compareLength = Comparator.comparing(String::length);

    static List<String> sortLength(String[] input){
        return Arrays.stream(input)
                .sorted(compareLength)
                .collect(Collectors.toList());
    }

    private static Comparator<String> fullCompare = compareLength.thenComparing(compareAlphabetically);

    public static List<String> sort(String[] input) {
        return Arrays.stream(input)
                .sorted(fullCompare)
                .collect(Collectors.toList());
    }
}
