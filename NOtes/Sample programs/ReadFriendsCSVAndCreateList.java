package com.myob;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFriendsCSVAndCreateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of file");
        try {
            FileInputStream fis = new FileInputStream(scanner.nextLine());
            Scanner fileScanner = new Scanner(fis);
            ArrayList<Friend> friendsList = new ArrayList<>();

            while(fileScanner.hasNext()) {
                String[] fileLineArr =  fileScanner.nextLine().split(",");
                String name = fileLineArr[0];
                String phone = fileLineArr[1];
                String[] dobArr = fileLineArr[2].split("/");
                LocalDate dob = LocalDate.of(Integer.parseInt(dobArr[2]),
                                                Integer.parseInt(dobArr[1]), Integer.parseInt(dobArr[0]));
                Friend friend = new Friend(name,dob,phone);
                friendsList.add(friend);
            }

            friendsList.forEach(System.out::println);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
