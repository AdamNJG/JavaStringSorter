package com.anjg.stringSorter.sorterService;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSorterService {
    private static Comparator<String> compareAlphabetically = Comparator.comparing(s -> s, String.CASE_INSENSITIVE_ORDER);

    private static Comparator<String> compareLength = Comparator.comparing(String::length);

    private static Comparator<String> fullCompare = compareLength.thenComparing(compareAlphabetically);

    public static List<String> sort(String[] input) {
        return Arrays.stream(input)
                .sorted(fullCompare)
                .collect(Collectors.toList());
    }
}
