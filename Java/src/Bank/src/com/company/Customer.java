package com.company;

import java.util.ArrayList;

public  class Customer {
    private String custId;
    private String firstName;
    private String lastName;
    private String email;
    private String addressForCommunication;
    private String custType;

    private static final String ANA = "ANA";
    private static int totalCustCreation = 0;
    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", addressForCommunication='" + addressForCommunication + '\'' +
                ", custType='" + custType + '\'' +
                '}';
    }

    public Customer(String firstName, String lastName, String email, String addressForCommunication, String custType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressForCommunication = addressForCommunication;
        this.custType = custType;
        this.custId = String.format("%s%04d",ANA,++totalCustCreation);
    }


    public  String getCustId() {
        return custId;
    }

    public  String getFirstName() {
        return firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  String getAddressForCommunication() {
        return addressForCommunication;
    }

    public final void setAddressForCommunication(String addressForCommunication) {
        this.addressForCommunication = addressForCommunication;
    }

    public String getCustType() {
        return custType;
    }

    public double getBalance(){
        return 0;
    }

    public boolean equals(Customer customer) {
        if(this.email.equals(customer.email) &&
                this.firstName.equals(customer.firstName) &&
                this.lastName.equals(customer.lastName)) {
            return true;
        } else {
            return false;
        }
    }
}
