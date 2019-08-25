package com.myob;

public class ContractEmployee extends Employee{
    private int tenureInMonths;
    private double ratePerHour;
    public ContractEmployee(String firstName,String lastName,int tenureInMonths,double ratePerHour) {
        super(firstName, lastName);
        this.tenureInMonths = tenureInMonths;
        this.ratePerHour = ratePerHour;
    }

    public int getTenureInMonths() {
        return tenureInMonths;
    }

    public void setTenureInMonths(int tenureInMonths) {
        this.tenureInMonths = tenureInMonths;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;

    }

    @Override
    public double getMonthlyPay() {
        return ratePerHour * 7.5*20;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "FirstName='" + this.getFirstName() + '\'' +
                ", LastName='" + this.getLastName() + '\'' +
                ", EmailId='" + this.getEmailId() + '\'' +
                ", EmpCode='" + this.getEmpCode() + '\'' +
                ", Joining Date=" + this.getJoiningDate() +
                "tenureInMonths=" + tenureInMonths +
                ", ratePerHour=" + ratePerHour +
                '}';
    }
}

