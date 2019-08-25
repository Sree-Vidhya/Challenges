package com.myob;

import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeSortAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Employee> listEmployee = new TreeSet<>();

        boolean loopForever = true;
        while (loopForever) {
            System.out.println("Enter a employee firstname");
            String firstName = scanner.nextLine();

            System.out.println("Enter a employee lastname");
            String lastName = scanner.nextLine();

            System.out.println("Enter employee salary");

            double salary = Double.parseDouble(scanner.nextLine());

            listEmployee.add(new Employee(firstName, lastName, salary));

            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }

        listEmployee.forEach(emp-> System.out.println(emp));

    }
}
