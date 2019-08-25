package com.myob;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean loopForever = true;
        int key = 100;

        while(loopForever) {
            System.out.println("Enter a String");
            treeMap.put(key--,scanner.nextLine());
            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }

        //treeMap.values()
        for(int mapKey:treeMap.keySet()) {
            System.out.printf("%d - %s\n",mapKey,treeMap.get(mapKey));
        }

        //Extracts them as key value pairs
        treeMap.forEach((koky,vovy)-> {
            System.out.printf("%d - %s",koky,vovy);
        });

        //Extracts them as keys first and then extracts value for each key
        treeMap.keySet().forEach(koky->{
            System.out.printf("%d - %s", koky, treeMap.get(koky));
        });

    }
}
