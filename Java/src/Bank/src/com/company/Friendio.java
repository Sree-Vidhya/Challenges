package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Friendio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Try a sample file");
            FileReader samplefile = new FileReader(scanner.nextLine());
            Scanner filescanner = new Scanner(samplefile);
            ArrayList<Friend> fileContent = new ArrayList<>();
            String[] myFileLines = null;
            while (filescanner.hasNext()){
                String[]fileLineArr = filescanner.nextLine().split(",");
                String name = fileLineArr[0];
                String phoneNumber = fileLineArr[1];
                String dob = fileLineArr[2];
                String month = fileLineArr[3];
                String year = fileLineArr[4];
                int year1 = Integer.parseInt(year);
                int age = Calendar.getInstance().get(Calendar.YEAR) - year1;
                String age1 = Integer.toString(age);
                Friend friend = new Friend(name,month,age1,phoneNumber);
                fileContent.add(friend);
            }
            fileContent.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong program needs to close!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
