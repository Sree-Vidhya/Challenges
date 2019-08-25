package com.myob;

public class PermanentEmployee  extends Employee{
    private double grossSalary;
    public PermanentEmployee(String firstName, String lastName,double grossSalary){
        super(firstName,lastName);
        this.grossSalary =grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public double getMonthlyPay() {
        return grossSalary/12;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "FirstName='" + this.getFirstName() + '\'' +
                ", LastName='" + this.getLastName() + '\'' +
                ", EmailId='" + this.getEmailId() + '\'' +
                ", EmpCode='" + this.getEmpCode() + '\'' +
                ", Joining Date=" + this.getJoiningDate() +
                "grossSalary=" + grossSalary +
                '}';
    }
}
