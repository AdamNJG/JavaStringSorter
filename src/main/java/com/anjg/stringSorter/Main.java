package com.anjg.stringSorter;

import com.anjg.stringSorter.sorterService.StringSorterService;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        printListDelimit(StringSorterService.sort(args), ",");
    }

    public static void printListDelimit(List<String> list, String delimiter){
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());

            if(iterator.hasNext()){
                System.out.print(String.format("%s ", delimiter));
            }
        }
    }
}
