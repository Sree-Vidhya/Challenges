package com.myob;

public class Employee implements Comparable {
    private String firstName;
    private String lastName;
    private double salary;
    private String empCode;
    private static int totalEmployees = 1;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.empCode = String.format("E%04d",totalEmployees++);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", empCode='" + empCode + '\'' +
                '}';
    }

    public String getEmpCode() {
        return empCode;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee) {
            //Casting the object to Employee
            Employee empToCompare = (Employee)o;
            return this.getLastName().compareTo(empToCompare.lastName);
        }
        return -1;
    }
}
