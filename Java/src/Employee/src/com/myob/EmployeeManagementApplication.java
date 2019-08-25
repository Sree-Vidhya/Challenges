package com.myob;
import java.util.Collection;
import java.util.Scanner;

public class EmployeeManagementApplication {

    private static Scanner scanner = new Scanner(System.in);

    private static void addEmployeeToDatabase() {
        System.out.println("Enter the first name of the employee");
        String firstName = scanner.nextLine();

        System.out.println("Enter the second name of the employee");
        String lastName = scanner.nextLine();

        System.out.println("Do u want to create a permanent employee (p)or temp employee(t)?");
        String employeeType= scanner.nextLine();

        Employee eNew = null;

        switch(employeeType){
            case "p":  System.out.println("Enter the gross annual salary of the employee");
                double salary = Double.parseDouble(scanner.nextLine());
                eNew = new PermanentEmployee(firstName,lastName,salary);
                break;

            case "t": System.out.println("Enter the Hourly rate of the employee");
                double ratePerHour = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the tenure in months");
                int tenureInMonths = Integer.parseInt(scanner.nextLine());
                eNew = new ContractEmployee(firstName,lastName,tenureInMonths,ratePerHour);
                break;

            default:
                System.out.println("Invalid Input. Try again!!");
                return;
        }

        EmployeeRecordManager.addEmployee(eNew);
        System.out.printf("%s successfully added\n",eNew);

    }

    private static void getEmployeeFromDatabase() {
        System.out.println("Enter the code of the employee you want to retrieve");
        String empCode = scanner.nextLine();

        Employee e1 = EmployeeRecordManager.getEmployee(empCode);
        if(e1 != null) {
            System.out.printf("%s ",e1);
        } else {
            System.out.println("No such employee found");
        }
    }

    private static void getAllEmployeesFromDatabase() {
        Collection<Employee> empCollection = EmployeeRecordManager.getAllEmployees();
        if(empCollection.isEmpty()) {
            System.out.println("There are no employees created yet");
        } else {
            for (Employee emp : EmployeeRecordManager.getAllEmployees()) {
                System.out.println(emp);
            }
        }
    }

    private static void deleteEmployeeFromDatabase() {
        System.out.println("Enter the code of the employee you want to delete");
        String empCode = scanner.nextLine();


        //EmployeeRecordManager.deleteEmployee(empCode);
        EmployeeRecordManager.deleteEmployee(EmployeeRecordManager.getEmployee(empCode));
    }

    private static void calculateTaxForEmployee() {
        System.out.println("Enter the code of the employee for whom you want to calculate tax");
        String empCode = scanner.nextLine();

        Employee e1 = EmployeeRecordManager.getEmployee(empCode);
        if(e1 != null && e1 instanceof PermanentEmployee) {
            double salary = ((PermanentEmployee)e1).getGrossSalary();
            double tax = 0;
            if (salary < 18200.00) {
                tax = 0;
            } else if (salary >= 18201 && salary < 37000.00) {
                tax = salary * .19;
            } else if (salary >= 37001 && salary < 90000.00) {
                tax = 3572 + ((salary - 37000) * .325);
            } else if (salary >= 90001 && salary < 180000.00) {
                tax = 20797 + ((salary - 90000) * .37);
            } else if (salary >= 180001) {
                tax = 54097 + ((salary - 180000) * .45);
            }
            System.out.println(String.format("%s %s has to pay %.2f as tax", e1.getFirstName(), e1.getLastName(), tax));
        } else {
            System.out.println("No such employee!");
        }
    }
    private static void getMonthlyPayForEmployee() {
        System.out.println("Enter the code of the employee to calculate Monthly pay");
        String empCode = scanner.nextLine();

        Employee e1 = EmployeeRecordManager.getEmployee(empCode);
        if(e1 != null) {

            System.out.println(String.format("%s %s has monthly pay of %.2f ", e1.getFirstName(), e1.getLastName(), e1.getMonthlyPay()));
        } else {
            System.out.println("No such employee!");
        }
    }
    public static void main(String[] args) {
        String reply = "Y";

        do {
            System.out.println("What operation would you like to do?\n" +
                    "Enter 1 to add and employee\n" +
                    "Enter 2 to get details of an employee\n" +
                    "Enter 3 to get list of all the employees\n" +
                    "Enter 4 to delete and employee\n" +
                    "Enter 5 to calculate tax of the employee\n" +
                    "Enter 6 to calculate the Monthly pay of the employee\n" +
                    "Enter Q to exit");

            reply = scanner.nextLine();

            switch (reply) {
                case "1":   addEmployeeToDatabase();
                    break;
                case "2":   getEmployeeFromDatabase();
                    break;
                case "3":   getAllEmployeesFromDatabase();
                    break;
                case "4":   deleteEmployeeFromDatabase();
                    break;
                case "5":   calculateTaxForEmployee();
                    break;
                case "6":   getMonthlyPayForEmployee();
                    break;
                case "Q":
                    System.exit(0);
                default :
                    System.out.println("Invalid input. Try again");
            }
        } while(true);
    }
}
