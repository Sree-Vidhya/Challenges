package com.myob;

import java.util.ArrayList;
import java.util.function.Consumer;

public class IterableClassWithMethodParam {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("One");
        stringArrayList.add(1,"Two");
        stringArrayList.add("Three");
        stringArrayList.add(null);
        stringArrayList.add("Four");
        stringArrayList.add("Five");

        stringArrayList.forEach(formatAndPrintString);

    }

    public static Consumer formatAndPrintString = (s)-> {
        if(s != null) {
            System.out.println("Printing MYOB String \t\t"+s);
        } else {
            System.out.println("Oops....This value is null");
        }
    };
}
