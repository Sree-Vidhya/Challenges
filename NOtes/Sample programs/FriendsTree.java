package com.myob;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeSet;

public class FriendsTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Friend> friendSet = new TreeSet<>();

        boolean continueLoop = true;

        while(continueLoop) {
            System.out.println("Enter friend's name");
            String name = scanner.nextLine();
            System.out.println("Enter friend's phone number");
            String phone = scanner.nextLine();
            System.out.println("Enter friend's dob in dd/mm/yyyy format");
            LocalDate dob = getDateFromString(scanner.nextLine());

            Friend friend = new Friend(name,dob,phone);
            friendSet.add(friend);
            System.out.println("Do you want to continue?");
            continueLoop = scanner.nextLine().equalsIgnoreCase("Y");
        }

        friendSet.forEach(s->{
            System.out.println(s);
        });

    }

    public static LocalDate getDateFromString(String strDate) {
        try {
            String[] dateArr = strDate.split("/");
            LocalDate date = LocalDate.of(Integer.parseInt(dateArr[2]),Integer.parseInt(dateArr[1]),Integer.parseInt(dateArr[0]));
            System.out.println(date);
            return date;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Invalid format of date");
        }
        return null;
    }
}
