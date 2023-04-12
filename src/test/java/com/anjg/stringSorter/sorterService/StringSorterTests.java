package com.anjg.stringSorter.sorterService;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class StringSorterTests {
    @Test void ListOfString_SortByStringLengthAndAlphabetically() {
        String[] strings = {"ZEBRA", "banana", "Dog", "Fish", "cat", "Drive", "NUMBER", "from"};

        Iterable<String> results = StringSorterService.sort(strings);
        Iterable<String> expected = new ArrayList<>(asList("cat", "Dog", "Fish", "from", "Drive", "ZEBRA", "banana", "NUMBER"));
        assertIterableEquals(expected, results);
    }
}
