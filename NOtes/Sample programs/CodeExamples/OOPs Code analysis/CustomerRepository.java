package com.company;

import java.util.Collection;
import java.util.HashMap;

public class CustomerRepository {
    private static HashMap<String,Customer> htCustomerData = new HashMap<>();

    protected static void addCustomer(Customer customer) {
        htCustomerData.put(customer.getCustId(),customer);
    }

    protected static boolean addDepositToCustomer(String customerId, double deposit) {
        Customer cust = htCustomerData.get(customerId);
        if(cust != null && cust instanceof BankingCustomer) {
            ((BankingCustomer)cust).depositAmount(deposit);
            return true;
        } else {
            System.out.println("Not a valid customer");
            return false;
        }
    }

    protected static boolean withdrawDepositFromCustomer(String customerId, double withdraw) {
        Customer cust = htCustomerData.get(customerId);
        if(cust != null && cust instanceof BankingCustomer) {
            ((BankingCustomer)cust).withDrawAmount(withdraw);
            return true;
        } else {
            System.out.println("Not a valid customer");
            return false;
        }
    }

    protected static boolean overdrawFromCustomer(String customerId, double withdraw) {
        Customer cust = htCustomerData.get(customerId);
        if(cust != null && cust instanceof LoanCustomer) {
            ((LoanCustomer)cust).overDraw(withdraw);
            return true;
        } else {
            System.out.println("Not a valid customer");
            return false;
        }
    }

    protected static Customer getCustomerFromDatabase(String custId) {
        return htCustomerData.get(custId);
    }

    protected static Collection<Customer> getCustomersFromDatabase() {
        return htCustomerData.values();
    }

    protected static void checkBalance(String customerId) {
        Customer cust = htCustomerData.get(customerId);
        if(cust != null) {
            System.out.println(cust.getBalance());
        }
        System.out.println("Not a valid customer");
    }

    protected static boolean loanPayoff(String customerId, double payOff) {
        Customer cust = htCustomerData.get(customerId);
        if(cust != null && cust instanceof LoanCustomer) {
            if(cust.getBalance() >= payOff) {
                ((LoanCustomer) cust).payOff(payOff);
                System.out.printf("%s %s has balance %.2f",cust.getFirstName(),cust.getLastName(),cust.getBalance());
                return true;
            } else {
                System.out.println("You can't payoff more than outstanding amount");
            }
            return true;
        } else {
            System.out.println("Not a valid customer");
            return false;
        }
    }

}
