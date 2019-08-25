package com.myob;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueNumberList {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            System.out.println("Enter a number");
            int n = Integer.parseInt(scanner.nextLine());
            if(aList.contains(n)) {
                System.out.println("Item already exists");
            } else {
                aList.add(n);
            }
//            System.out.println("Do you want to continue?");
//            continueLoop = scanner.nextLine().equalsIgnoreCase("Y");
        } while(continueLoop);

        for(int i:aList) {
            System.out.println(i);
        }
    }
}
