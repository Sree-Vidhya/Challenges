package com.company;

import com.company.Employee;

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

            Employee emp = new Employee(firstName,lastName,salary);
            listEmployee.add(emp);

//            listEmployee.add(new Employee(firstName,lastName,salary));

            System.out.println("Do you want to continue?");
            loopForever = scanner.nextLine().equalsIgnoreCase("Y");
        }



        while(true) {
            System.out.println("Print 1 for employees sal > 100000 and 2 for employees sal <= 100000 and 3 to search by lastname");
            String choice = scanner.nextLine();
            switch (choice) {
                case "2":
                    System.out.println("Salary less than 100000 ");
                    printEmployeesWithSalaryLessThanEqual100000(listEmployee);
                    break;
                case "1":
                    System.out.println("Salary greater than 100000 ");
                    printEmployeesWithSalaryMoreThan100000(listEmployee);
                    break;
                case "3": System.out.println("Enter the criteria to search in the lastname ");
                    String value = scanner.nextLine();
                    searchLastname(listEmployee,value);
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

    public static void searchLastname(ArrayList<Employee>listEmployee,String value) {
        List search = listEmployee.stream().filter(emp->{
            return emp.getLastName().contains(value);
    }).collect(Collectors.toList());
        search.forEach(emp->{
            System.out.println(emp);
    });

}}
