package com.myob;

import java.util.ArrayList;

public class IterableList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("One");
        stringArrayList.add("Three");
        stringArrayList.add("Four");
        stringArrayList.add("Five");
        stringArrayList.add(null);
        stringArrayList.add(1,"Two");
        stringArrayList.add("One");
        stringArrayList.add("Two");

//        stringArrayList.forEach(System.out::println);

        stringArrayList.forEach(s -> {
            System.out.println("The next element is ");
            System.out.println(s);
        });
    }
}
