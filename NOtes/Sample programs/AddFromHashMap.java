package com.myob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddFromHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean loopForever = true;
        int key = 1;
        while(loopForever) {
            System.out.println("Enter a String");
            hashMap.put(key++,scanner.nextLine());
            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }

        ArrayList<String> alistValues = new ArrayList<>();
        alistValues.addAll(hashMap.values());

        alistValues.forEach(s -> {
            System.out.println(s);
        });
    }
}
