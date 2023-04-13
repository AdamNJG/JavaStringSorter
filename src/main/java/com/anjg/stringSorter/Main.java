package com.anjg.stringSorter;

import com.anjg.stringSorter.sorterService.StringSorterService;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //printStreams(args);
        printQuickSort(args);
    }

    public static void printStreams(String[] input) {
        Iterator<String> iterator = StringSorterService.sort(input).iterator();

        printIterator(iterator);
    }

    public static void printQuickSort(String[] input) {
        Iterator<String> iterator = Arrays.stream(StringSorterService.quickSort(input)).iterator();

        printIterator(iterator);
    }

    public static void printIterator(Iterator<String> iterator){
        while(iterator.hasNext()){
            System.out.print(iterator.next());

            if(iterator.hasNext()){
                System.out.print(String.format("%s ", ','));
            }
        }
    }
}
