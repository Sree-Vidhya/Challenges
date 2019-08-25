package com.myob;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Employee> myTreeSet = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while(continueLoop){
            System.out.println("Enter a firstname");
            String firstName = scanner.nextLine();

            System.out.println("Enter a lastName");
            String lastName = scanner.nextLine();

            System.out.println("Enter salary");
            double salary = Double.parseDouble(scanner.nextLine());

            myTreeSet.add(new Employee(firstName,lastName,salary));

            System.out.println("Do you want to continue? Y/N");
            continueLoop = scanner.nextLine().equalsIgnoreCase("Y");
        }
       //myTreeSet.add(null);
//       myTreeSet.add(null);

        myTreeSet.forEach(s -> System.out.println(s));
    }
}
