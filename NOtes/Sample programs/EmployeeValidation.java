package com.myob;

import com.myob.examples.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> listEmployee = new ArrayList<>();

        boolean loopForever = true;
        while(loopForever) {
            System.out.println("Enter a employee firstname");
            String firstName = scanner.nextLine();

            System.out.println("Enter a employee lastname");
            String lastName = scanner.nextLine();

            System.out.println("Enter employee salary");

            double salary = Double.parseDouble(scanner.nextLine());

//            Employee emp = new Employee(firstName,lastName,salary);
//            listEmployee.add(emp);

            listEmployee.add(new Employee(firstName,lastName,salary));

            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }

        while(true) {
            System.out.println("Print 1 for employees sal > 100000 and 2 for employees sal <= 100000");
            String choice = scanner.nextLine();
            switch (choice) {
                case "2":
                    printEmployeesWithSalaryLessThanEqual100000(listEmployee);
                    break;
                case "1":
                    printEmployeesWithSalaryMoreThan100000(listEmployee);
                    break;
                default:
                    System.out.println("Invalid data");
                    System.exit(0);
            }
        }

    }

    public static void printEmployeesWithSalaryLessThanEqual100000(ArrayList<Employee> listEmployee) {
        List tmpList = listEmployee.stream().filter(emp->{
            return emp.getSalary() <= 100000;
        }).collect(Collectors.toList());

        tmpList.forEach(emp-> {
            System.out.println(emp);
        });
    }

    public static void printEmployeesWithSalaryMoreThan100000(ArrayList<Employee> listEmployee) {
        List tmpList = listEmployee.stream().filter(emp->{
            return emp.getSalary() > 100000;
        }).collect(Collectors.toList());

        tmpList.forEach(emp-> {
            System.out.println(emp);
        });
    }

}
