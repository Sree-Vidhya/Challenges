package com.myob;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PayslipGeneratorApplication {
    private static CalculatedPaySlip myPayslipGeneratorApplication = new CalculatedPaySlip();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base_tax = 0.00;
        double extra_cents = 0.00;
        double base_salary = 0.00;
        String answer;
        System.out.println("Enter the file name to create:");
        String fileName = input.nextLine();
        try {
            FileWriter filewriter=new FileWriter(fileName);
        do {

            System.out.println("Please enter your first name");
            String fname = input.next();
            System.out.println("Please enter your  surname");
            String sname = input.next();
            System.out.println("Please enter your annual salary");
            double salary = Double.parseDouble(input.next());
            double grossIncome = myPayslipGeneratorApplication.GrossIncomeMthd(salary);
            grossIncome = Math.ceil(grossIncome);
            double ssuperRate = myPayslipGeneratorApplication.SuperRateMthd(salary);
            String sDate = myPayslipGeneratorApplication.startingPeriod();
            String eDate = myPayslipGeneratorApplication.endingPeriod();
            if (salary > 18201 && salary < 37000) {
                extra_cents = 0.19;
                base_salary = 18200;
            } else if (salary > 37001 && salary < 87000) {
                base_tax = 3572;
                extra_cents = 0.325;
                base_salary = 37000;
            } else if (salary > 87001 && salary < 180000) {
                base_tax = 19822;
                extra_cents = 0.37;
                base_salary = 87000;
            } else if (salary > 180001) {
                base_tax = 54232;
                extra_cents = 0.45;
                base_salary = 180000;
            }
            double income_tax = (base_tax + (salary - base_salary) * extra_cents) / 12;
            income_tax = Math.ceil(income_tax);
            double net_income = grossIncome - income_tax;
            System.out.println("Your payslip has been generated");
            System.out.println("-----------------------------------");
            System.out.println("Name:           " + fname + " " + sname);
            filewriter.write(fname);
            filewriter.write(sname);
            filewriter.append('\n');
            System.out.println("Pay period:     " + sDate + "-" + eDate);
            filewriter.write(sDate);
            filewriter.write("-");
            filewriter.write(eDate);
            filewriter.append('\n');
            System.out.println("Gross income:   " + grossIncome);
            filewriter.write(Double.toString(grossIncome));
            filewriter.append('\n');
            System.out.println("Income tax:     " + income_tax);
            filewriter.write(Double.toString(income_tax));
            filewriter.append('\n');
            System.out.println("Net Income:     " + net_income);
            filewriter.write(Double.toString(net_income));
            filewriter.append('\n');
            System.out.println("Super:          " + ssuperRate);
            filewriter.write(Double.toString(ssuperRate));
            filewriter.append('\n');
            System.out.println("-----------------------------------");
            System.out.println("Thank you for using MYOB!");
            System.out.println("Do you want to continue?");
            answer = input.next();
        }while(!(answer.equalsIgnoreCase("n")));
            filewriter.flush();
            filewriter.close();
} catch (IOException e) {
            e.printStackTrace();
        }
    }}