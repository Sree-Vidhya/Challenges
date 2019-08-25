package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class BankingCustomer extends Customer {
    private String accountType;
    private double accountBalance;
    public static final String BANKING = "BANKING";

    public  static final String SAVINGS = "SAVINGS";
    public  static final String CHEQUE = "CHEQUE";
    public  static final String CURRENT = "CURRENT";

    public BankingCustomer(String firstName, String lastName, String email,
                           String addressForCommunication, String accountType) {
        super(firstName,lastName,email,addressForCommunication,BANKING);
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

//    public void setAccountBalance(double accountBalance) {
//        this.accountBalance = accountBalance;
//        if(accountBalance > 10000){
//            System.out.println("Employees with account balance higher than 10000" + accountBalance);
//        }
//    }

    public void depositAmount(double amountToDeposit) {
        this.accountBalance += amountToDeposit;
    }

    public void withDrawAmount(double withdrawAmount) {
        if(withdrawAmount>accountBalance) {
            System.out.println("Insufficient balance");
        } else if (withdrawAmount > 5000) {
            System.out.println("Max withdrawal limit is 5000");
        } else {
            accountBalance -= withdrawAmount;
        }
    }


    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "BankingCustomer{" +
                "Customer Id='" + this.getCustId() + '\'' +
                ", First Name='" + this.getFirstName() + '\'' +
                ", Last Name='" + this.getLastName() + '\'' +
                ", Email='" + this.getEmail() + '\'' +
                ", Address For Communication='" + this.getAddressForCommunication() + '\'' +
                ", Customer Type='" + this.getCustType() + '\'' +
                ", Account Type='" + accountType + '\'' +
                ", Account Balance=" + accountBalance +
                '}';
    }
}
