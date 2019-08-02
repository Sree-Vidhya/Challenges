import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;
import java.lang.Math.*;
import java.util.Random;
public class Main {
    Scanner input = new Scanner(System.in);
    //print the sum
// Calling a function
//    public static int fibonacciSeries(int n) {
//
//        int a = 0, b = 1, c = 0, i;
//        for (i = 0; i < n; i++) {
//            c = a + b;
//            System.out.println(c);
//            a = b;
//            b = c;
//        }
//        return c;
//    }
//    // System.out.println("------------------------------------------------------------------------------------------");
//    public static int product(int n) {
//
//        int a = 1, b = 2, c = 0, i;
//        for (i = 0; i < n; i++) {
//            c = a * b;
//            System.out.println(c);
//            a = b;
//            b = c;
//        }
//        return c;
//    }
// System.out.println("-----------------------------------------------------------------------------------------------");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 to 100");
//        int n = Integer.parseInt(input.next());
//        if(n % 3 == 0 || n % 5 ==0) {
//
//            fibonacciSeries(n);
//        }
//        else {
//            System.out.println("Not a multiple of 3 or 5");
//        }
//        System.out.println("------------------------------------------------------------------------------------------");

//        String message = "Hello Universe!!";
//        System.out.println();
//        System.out.println("Hello World!!");
//        System.out.println(message);
//        System.out.println("Enter your name");
//        String name = input.next();
//        System.out.println("Hello " +name );
//        System.out.println();
//        // if else
//        if (name.equals("Alice"))
//        {
//            System.out.println("Hi " +name );
//        }
//        else if (name.equals( "Bob"))
//        {
//            System.out.println("Hi " +name );
//        }
//        else {
//            System.out.println("Hi there!!");
//        }
//        System.out.println("------------------------------------------------------------------------------------------");
//       // Magic Year
//
//        System.out.println("Welcome to magic year calculator!!");
//        System.out.println("Please enter your first name");
//        String fname = input.next();
//        System.out.println("Please enter your surname");
//        String sname = input.next();
//        System.out.println("Please enter your annual salary");
//        int salary = Integer.parseInt(input.next());
//        System.out.println("Please enter your work start year");
//        int year = Integer.parseInt(input.next());
//        int myear = year + 65;
//        System.out.println("Your magic age details are:");
//        System.out.println("---------------------------");
//        System.out.println("Name: " +fname + sname);
//        System.out.println("Monthly Salary: " +salary);
//        System.out.println("Magic Year: " +myear);
//        System.out.println("------------------------------------------------------------------------------------------");
//        Payslip generator
//        System.out.println("Welcome to payslip Generator: ");
//        System.out.println("Please enter your first name");
//        String fname = input.next();
//        System.out.println("Please enter your surname");
//        String sname = input.next();
//        System.out.println("Please enter your annual salary");
//        int salary = Integer.parseInt(input.next());
//        int gross_income = salary / 12;
//        System.out.println("Please enter super rate: ");
//        int rate = Integer.parseInt(input.next());
//        int super_rate = (gross_income * 9)/100;
//        System.out.println("Please enter payment start date: ");
//        String payment_start = input.next();
//        System.out.println("Please enter payment end date: ");
//        String payment_end = input.next();
//        double base_tax = 0.00;
//        double extra_cents = 0.00;
//        double base_salary = 0.00;
//        if (salary >18201 && salary < 37000){
//             extra_cents = 0.19;
//             base_salary =18200;
//        }
//        else if (salary >37001 && salary < 87000){
//            base_tax = 3572;
//            extra_cents = 0.325;
//            base_salary =37000;
//        }
//        else if (salary >87001 && salary < 180000){
//            base_tax = 19822;
//            extra_cents = 0.37;
//            base_salary =87000;
//        }
//        else if (salary >180001){
//            base_tax = 54232;
//            extra_cents = 0.45;
//            base_salary =180000;
//        }
//        double income_tax = (base_tax + (salary - base_salary) * extra_cents) / 12;
//        income_tax = Math.ceil(income_tax);
//        double net_income = gross_income - income_tax;
//        System.out.println("Your payslip has been generated");
//        System.out.println("-----------------------------------");
//        System.out.println("Name:           "+fname +" "+sname);
//        System.out.println("Pay period:     " +payment_start +"-"+payment_end);
//        System.out.println("Gross income:   " +gross_income);
//        System.out.println("Income tax:     "+income_tax);
//        System.out.println("Net Income:     "+net_income);
//        System.out.println("Super:          " +super_rate);
//        System.out.println("-----------------------------------");
//        System.out.println("Thank you for using MYOB!");
//       System.out.println("------------------------------------------------------------------------------------------");
        //displaying multiples of 3 and 5

//        int a = 0, b = 1, c = 0, i;
//        for (i = 0; i < n; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            if (c % 3 == 0)  {
//                System.out.println(c);
//            }
//            else if (c %5 ==0){
//                System.out.println(c);
//            }
//        }
//        System.out.println("------------------------------------------------------------------------------------------");
//        System.out.println("Enter a number:");
//        int number = Integer.parseInt(input.next());
//        System.out.println("Press 1 for Addition or 2 for multiplication");
//        int n = Integer.parseInt(input.next());
//        switch(n){
//            case 1:
//                System.out.println(fibonacciSeries( number));
//                break;
//            case 2:
//                System.out.println(product( number));
//                break;
//        }
//        System.out.println("------------------------------------------------------------------------------------------");
        //Multiplication table till 12
//        int a = 0;
//        for(int i = 1; i<13; i++ ){
//            System.out.println("Multiplication of: " + i );
//            System.out.println("-----------------------");
//            for( int j = 1; j<13; j++){
//                a = i * j;
//                System.out.println( i + " X " + j + " = " + a);
//            }
//            System.out.println("----------------------------------");
//        }
        //        System.out.println("------------------------------------------------------------------------------------------");
//        double x = Math.random();
//        double y = x * 10;
//        y= Math.ceil(y);
////        System.out.println(y);
//        double n =0.0;
//        double a = y + 2;
//        double b = y - 2;
//        System.out.println("Guess the number");
//        do {
//         n = Double.parseDouble(input.next());
//
//            if (n > a) {
//                System.out.println("Too large");
//            } else if (n > y) {
//                System.out.println("large");
//            } else if (n < b) {
//                System.out.println("Too Small");
//            } else if (n < y) {
//                System.out.println("small");
//            } else {
//                System.out.println("Correct!!");
//            }
//        }while(y != n);
        //        System.out.println("------------------------------------------------------------------------------------------");
        int currentYear = 2019;
        int i =0;

//        for (currentYear = 2019; currentYear < 2100; currentYear++) {
//            if (currentYear % 4 == 0) {
//                System.out.println(currentYear);
//            }
//        }
        do{
        if(currentYear % 4 == 0){
            System.out.println(currentYear);
            i++;
        }
            currentYear++;
        }while(i < 20);
    }
}
