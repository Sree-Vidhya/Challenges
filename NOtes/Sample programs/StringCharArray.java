package com.myob;

import java.util.Scanner;
import java.util.TreeMap;

public class StringCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,char[]> treeMap = new TreeMap<>();

        boolean quitLoop = false;

        while(!quitLoop) {
            System.out.println("Enter a String");
            String strInput = scanner.nextLine();
            treeMap.put(strInput,strInput.toCharArray());
            System.out.println("Do you want to quit? Y/N");
            quitLoop = scanner.nextLine().equalsIgnoreCase("Y");
        }

        treeMap.forEach((k,v)->{
            System.out.print(k+" ");
            for(char c:v) {
                System.out.print("'"+c+"' ");
            }
            System.out.println();
        });
    }
}
