package com.myob.ems;

import java.time.LocalDateTime;

public class Employee {
    private String firstName;
    private String lastName;
    private String emailId;
    private String empCode;
    private LocalDateTime joiningDate;
    private double grossSalary;


    private static int totalEmployees = 0;

    private static String emailSuffix = "@myob.com";


    public Employee(String firstName, String lastName, double grossSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSalary = grossSalary;
        this.setEmpCode(String.format("E%04d",++totalEmployees));
        this.setEmailId(firstName.toLowerCase()+"."+lastName.toLowerCase()+emailSuffix);
        this.joiningDate = LocalDateTime.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", EmailId='" + emailId + '\'' +
                ", EmpCode='" + empCode + '\'' +
                ", Joining Date=" + joiningDate +
                ", Gross Salary=" + grossSalary +
                '}';
    }
}
