package com.myob;

import java.util.Scanner;

public class PrintZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Which Zodiac do you want to know about? (Type Q to quit)");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                Zodiac myZodiac = Zodiac.valueOf(input.toUpperCase());

                if (myZodiac != null) {
                    System.out.println(myZodiac);
                    System.out.println(myZodiac.getDateRange());
                    System.out.println(myZodiac.getRulingPlanet());
                    System.out.println(myZodiac.getSymbol());
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Zodiac");
            }
        }
    }
}
