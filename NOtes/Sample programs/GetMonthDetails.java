package com.myob;

import java.util.Scanner;

public class GetMonthDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while(continueLoop) {
            System.out.println("Enter the name of a month");
            String month = scanner.nextLine().toUpperCase();
            Months m = null;
            try {
                m = Months.valueOf(month);
            } catch(IllegalArgumentException e) {
                System.out.println("Invalid month");
                System.exit(0);
            }
            System.out.println("What would you like to know about the month?");
            System.out.println("Enter 1 to find out which month of the year it is");
            System.out.println("Enter 2 to get month number in MM format");
            System.out.println("Enter 3 for the French equivalent");
            System.out.println("Enter Q to quit");
            String response = scanner.nextLine();
            switch(response) {
                case "1":
                    System.out.println(m.getCardinal());
                    break;
                case "2":
                    System.out.println(m.getNumInMMFormat());
                    break;
                case "3":
                    System.out.println(m.getFrenchVersion());
                    break;
                case "Q": System.exit(0);
                default:
                    System.out.println("Try again!");
            }

        }

    }
}
