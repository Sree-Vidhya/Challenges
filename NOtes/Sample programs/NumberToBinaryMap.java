package com.myob;

import java.util.Scanner;
import java.util.TreeMap;

public class NumberToBinaryMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("Enter the number you want to go until (10 to 20)");
        int numUntil = Integer.parseInt(scanner.nextLine());
        if(numUntil > 20 || numUntil<10) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        for(int i=1;i<=numUntil;i++) {
            treeMap.put(i,Integer.toBinaryString(i));
        }

        treeMap.forEach((num,bin)->{
            System.out.println(num+"   "+bin);
        });

    }
}
