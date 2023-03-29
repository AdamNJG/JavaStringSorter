package com.anjg.stringSorter.sorterService;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class StringSorterTests {

     // Left these tests here for transparency on how I worked on the problem,
     // usually these and the methods that they point to would be
    @Test
    public void ListOfStrings_SortAlphabetically() {
        String[] strings = {"ZEBRA", "banana", "Dog", "Fish"};

        Iterable<String> results = StringSorterService.sortAlphabetically(strings);
        Iterable<String> expected = new ArrayList<>(asList("banana", "Dog", "Fish", "ZEBRA"));
        assertIterableEquals(expected, results);
    }

    @Test
    public void ListOfStrings_SortByStringLength() {
        String[] strings = {"ZEBRA", "banana", "Dog", "Fish"};

        Iterable<String> results = StringSorterService.sortLength(strings);
        Iterable<String> expected = new ArrayList<>(asList("Dog", "Fish", "ZEBRA", "banana"));
        assertIterableEquals(expected, results);
    }

    @Test void ListOfString_SortByStringLengthAndAlphabetically() {
        String[] strings = {"ZEBRA", "banana", "Dog", "Fish", "cat", "Drive", "NUMBER", "from"};

        Iterable<String> results = StringSorterService.sort(strings);
        Iterable<String> expected = new ArrayList<>(asList("cat", "Dog", "Fish", "from", "Drive", "ZEBRA", "banana", "NUMBER"));
        assertIterableEquals(expected, results);
    }
}
