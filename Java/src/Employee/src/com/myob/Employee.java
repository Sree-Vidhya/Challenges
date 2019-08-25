package com.myob;

import java.time.LocalDateTime;

//abstract class is not instantiable only inheritable
//if class is final it can't have sub classes. Only can create instances
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String emailId;
    private String empCode;
    private LocalDateTime joiningDate;


    private static int totalEmployees = 0;
//Final variable can't be changed
    private final static String emailSuffix = "@myob.com";

    public Employee(){
        this.setEmpCode(String.format("E%04d",++totalEmployees));
        this.joiningDate = LocalDateTime.now();
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.setEmpCode(String.format("E%04d",++totalEmployees));
        this.setEmailId(firstName.toLowerCase()+"."+lastName.toLowerCase()+emailSuffix);
        this.joiningDate = LocalDateTime.now();
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getEmailId() {
        return emailId;
    }

    public final void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public final String getEmpCode() {
        return empCode;
    }

    public final void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public final LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public final void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    public abstract double getMonthlyPay();
    //abstract method can be used in subclasses but not on the super class
//Method can either be abstract or final but not at the same time
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "FirstName='" + firstName + '\'' +
//                ", LastName='" + lastName + '\'' +
//                ", EmailId='" + emailId + '\'' +
//                ", EmpCode='" + empCode + '\'' +
//                ", Joining Date=" + joiningDate +
//
//                '}';
//    }
}
