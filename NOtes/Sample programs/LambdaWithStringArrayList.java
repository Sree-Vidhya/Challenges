package com.myob;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class LambdaWithStringArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean loopForever = true;
        while(loopForever) {
            System.out.println("Enter a string");
            String userInput = scanner.nextLine();
            if (userInput.length()>0) {
                stringArrayList.add(userInput);
            } else {
                stringArrayList.add(null);
            }
            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }

        stringArrayList.forEach(PrintFormatClass.formatAndPrintString);

    }
}
