package com.myob;

import java.util.Scanner;

public class CalculatedPaySlip implements GrossIncome, NetIncome, PayPeriod, SuperRate {
    Scanner input = new Scanner(System.in);

    @Override
        public double GrossIncomeMthd(double salary)
    {
            return salary / 12;
    }

    @Override
    public String startingPeriod()
    {
        System.out.println("Please Enter the Starting Period");
        String sDate = input.nextLine();
        return sDate;
    }

    @Override
    public String endingPeriod() {
        System.out.println("Please Enter the Ending Period");
        String eDate = input.nextLine();
        return eDate;
    }



    @Override
    public double NetIncomeMthd(double salary)
    {
        return ((salary/12) - incomeTax);
    }

    @Override
    public double SuperRateMthd(double salary)
    {
        System.out.println("Please enter your super rate");
        double rateOfSuper = Double.parseDouble(input.nextLine());
        double a =  salary /12;
        double b = a * rateOfSuper/100;
        b= Math.ceil(b);
        return b;
    }


//
}
