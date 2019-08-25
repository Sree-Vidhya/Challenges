package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,Employee> listEmployee = new TreeMap<>();

        boolean loopForever = true;
        while(loopForever) {
            System.out.println("Enter a employee firstname");
            String firstName = scanner.nextLine();

            System.out.println("Enter a employee lastname");
            String lastName = scanner.nextLine();

            System.out.println("Enter employee salary");

            double salary = Double.parseDouble(scanner.nextLine());

            Employee emp = new Employee(firstName,lastName,salary);
            listEmployee.put(emp.getEmpCode(),emp);

//            listEmployee.add(new Employee(firstName,lastName,salary));

            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }
        listEmployee.forEach((empCode,emp)->{
            System.out.printf("%s - %s",empCode,emp,"\n");
       });
//        System.out.println(listEmployee);

    }
}
