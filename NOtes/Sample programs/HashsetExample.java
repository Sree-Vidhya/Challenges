package com.myob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HashsetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        boolean continueLoop = true;
        while(continueLoop){
            System.out.println("Enter a string to add to the collection");
            String userInput = scanner.nextLine();
            hashSet.add(userInput);

            System.out.println("Do you want to continue? Y/N");
            continueLoop = scanner.nextLine().equalsIgnoreCase("Y");
        }
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);


        hashSet.forEach(s-> System.out.println(s));

        ArrayList<Integer> naturalNumbers = new ArrayList<>();

        for(int i=0;i<100;i++) {
            naturalNumbers.add(i);
        }

        naturalNumbers.stream().filter(num->{
            return num%2 == 1;
        }).collect(Collectors.toList());
    }
}
