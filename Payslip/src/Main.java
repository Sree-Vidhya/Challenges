import java.util.Scanner;

public class Main {


    public static String firstName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String fname = input.next();
        return fname;
    }
    public static String surName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your  surname");
        String sname = input.next();
        return sname;

    }
    public static int salary(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your annual salary");
        int salary = Integer.parseInt(input.next());
        return salary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Magic Year

        System.out.println("Welcome to magic year calculator!!");
        String firstName = firstName();
        String surName =surName();
        int salary =salary();

        System.out.println("Please enter your work start year");
        int year = Integer.parseInt(input.next());
        int myear = year + 65;
        System.out.println("Your magic age details are:");
        System.out.println("---------------------------");
        System.out.println("Name: " + firstName +surName);
        System.out.println("Monthly Salary: " +salary);
        System.out.println("Magic Year: " +myear);
        System.out.println("------------------------------------------------------------------------------------------");
//        Payslip generator

        System.out.println("Welcome to payslip Generator: ");
        int gross_income = salary / 12;
        System.out.println("Please enter super rate: ");
        int rate = Integer.parseInt(input.next());
        int super_rate = (gross_income * 9)/100;
        System.out.println("Please enter payment start date: ");
        String payment_start = input.next();
        System.out.println("Please enter payment end date: ");
        String payment_end = input.next();
        double base_tax = 0.00;
        double extra_cents = 0.00;
        double base_salary = 0.00;
        if (salary >18201 && salary < 37000){
            extra_cents = 0.19;
            base_salary =18200;
        }
        else if (salary >37001 && salary < 87000){
            base_tax = 3572;
            extra_cents = 0.325;
            base_salary =37000;
        }
        else if (salary >87001 && salary < 180000){
            base_tax = 19822;
            extra_cents = 0.37;
            base_salary =87000;
        }
        else if (salary >180001){
            base_tax = 54232;
            extra_cents = 0.45;
            base_salary =180000;
        }
        double income_tax = (base_tax + (salary - base_salary) * extra_cents) / 12;
        income_tax = Math.ceil(income_tax);
        double net_income = gross_income - income_tax;
        System.out.println("Your payslip has been generated");
        System.out.println("-----------------------------------");
        System.out.println("Name:           "+firstName +" "+surName);
        System.out.println("Pay period:     " +payment_start +"-"+payment_end);
        System.out.println("Gross income:   " +gross_income);
        System.out.println("Income tax:     "+income_tax);
        System.out.println("Net Income:     "+net_income);
        System.out.println("Super:          " +super_rate);
        System.out.println("-----------------------------------");
        System.out.println("Thank you for using MYOB!");
    }
}
