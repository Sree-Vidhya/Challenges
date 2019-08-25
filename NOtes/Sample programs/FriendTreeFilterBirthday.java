package com.myob;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FriendTreeFilterBirthday {
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

        continueLoop = true;
        while(continueLoop) {
            System.out.println("Enter the month you want to search for");
            String month = scanner.nextLine();
            List list = friendSet.stream().filter(friend-> {
                return friend.getDob().getMonth().name().equalsIgnoreCase(month);
            }).collect(Collectors.toList());

            if(list.isEmpty()) {
                System.out.println("No matching records found!");
            }

            list.forEach(friend-> System.out.println(friend));
            System.out.println("Do you want to continue?");
            continueLoop = scanner.nextLine().equalsIgnoreCase("Y");
        }
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
