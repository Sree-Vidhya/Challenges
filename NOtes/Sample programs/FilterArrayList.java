package com.myob;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class FilterArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        List<String> filteredList = new ArrayList<>();

        stringArrayList.add("One");
        stringArrayList.add(1,"Two");
        stringArrayList.add("Three");
        stringArrayList.add("Five");
        stringArrayList.add(4,"Four");
        stringArrayList.add(null);
        stringArrayList.add(null);
        stringArrayList.add(null);

        System.out.println("The values contained in the list are ");
        stringArrayList.forEach(s-> System.out.println(s));

        filteredList = stringArrayList.stream().filter(s-> {
            return (s != null && s.contains("Four"));
        }).collect(Collectors.toList());

        System.out.println("The filtered list contains:");
        filteredList.forEach(s -> System.out.println(s));

    }
}
