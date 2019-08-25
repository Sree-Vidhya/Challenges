package com.company;

public abstract class Customer {
    private String custId;
    private String firstName;
    private String lastName;
    private String email;
    private String addressForCommunication;
    private String custType;

    private static final String ANA = "ANA";
    private static int totalCustCreation = 0;

    public Customer(String firstName, String lastName, String email, String addressForCommunication, String custType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressForCommunication = addressForCommunication;
        this.custType = custType;
        this.custId = String.format("%s%04d",ANA,++totalCustCreation);
    }

    public final String getCustId() {
        return custId;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getAddressForCommunication() {
        return addressForCommunication;
    }

    public final void setAddressForCommunication(String addressForCommunication) {
        this.addressForCommunication = addressForCommunication;
    }

    public String getCustType() {
        return custType;
    }

    public abstract double getBalance();

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
