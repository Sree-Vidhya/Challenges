package com.company;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerManagementApplication {

    private static Scanner scanner = new Scanner(System.in);

    private static void addCustomerToDatabase() {
        System.out.println("Enter the first name of the customer");
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name of the customer");
        String lastName = scanner.nextLine();

        System.out.println("Enter the email of the customer");
        String email = scanner.nextLine();

        System.out.println("Enter the address of the customer");
        String address = scanner.nextLine();

        System.out.println("Enter 1 for Banking and 2 for Loan");
        String custType = scanner.nextLine();

        Customer customer = null;

        switch(custType) {
            case "1" :          System.out.println("Enter the type of account\n" +
                                "1 Savings\n" +
                                "2 Cheque\n" +
                                "3 Current\n");
                                String  accountType = scanner.nextLine();
                                accountType =   accountType.equals("1") ? BankingCustomer.SAVINGS :
                                                accountType.equals("2") ? BankingCustomer.CHEQUE :
                                                accountType.equals("3") ? BankingCustomer.CURRENT : null;

                                if(accountType == null) {
                                    System.out.println("Invalid account type");
                                    return;
                                }



                                customer = new BankingCustomer(firstName,lastName, email,address,accountType);
                                break;

            case "2" :          System.out.println("Enter the type of loan\n" +
                                    "1 Housing\n" +
                                    "2 Personal\n" +
                                    "3 Car\n");
                                String  loanType = scanner.nextLine();
                                loanType =   loanType.equals("1") ? LoanCustomer.HOUSING :
                                        loanType.equals("2") ? LoanCustomer.PERSONAL :
                                                loanType.equals("3") ? LoanCustomer.CAR : null;

                                if(loanType == null) {
                                    System.out.println("Invalid loan type");
                                    return;
                                }
                                System.out.println("Amount of loan borrowed");
                                double loanAmount = Double.parseDouble(scanner.nextLine());

                                customer = new LoanCustomer(firstName,lastName, email,address,loanType,loanAmount);
                                break;
            default:
                System.out.println("Invalid Input. Try again");
                return;
        }

        CustomerRepository.addCustomer(customer);
        System.out.printf("%s successfully added\n",customer);

    }

    private static Customer getCustomerWithCode() {
        System.out.println("Enter code of the customer who wants to deposit");
        String custCode = scanner.nextLine();
        return CustomerRepository.getCustomerFromDatabase(custCode);
    }
    private static void getCustomerFromDatabase() {
        Customer customer = getCustomerWithCode();
        if(customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("No such customer in database");
        }
    }

    private static void depositAmount() {

        System.out.println("Enter code of the customer who wants to deposit");
        String custCode = scanner.nextLine();

        System.out.println("Enter amount to deposit");
        double deposit = Double.parseDouble(scanner.nextLine());

        if(!(CustomerRepository.addDepositToCustomer(custCode,deposit))) {
            System.out.println("Operation failed");
        }
    }

    private static void withdrawAmount() {
        System.out.println("Enter code of the customer who wants to withdraw");
        String custCode = scanner.nextLine();

        System.out.println("Enter amount to withdraw");
        double withdraw = Double.parseDouble(scanner.nextLine());

        if(!(CustomerRepository.withdrawDepositFromCustomer(custCode,withdraw))) {
            System.out.println("Operation failed");
        }
    }

    private static void overdrawOnLoan() {
        System.out.println("Enter code of the customer who wants to overdraw");
        String custCode = scanner.nextLine();

        System.out.println("Enter amount to overdraw");
        double withdraw = Double.parseDouble(scanner.nextLine());

        if(!(CustomerRepository.overdrawFromCustomer(custCode,withdraw))) {
            System.out.println("Operation failed");
        }
    }

    private static void checkBalance() {
        System.out.println("Enter code of the customer whose balance you want to check");
        String custCode = scanner.nextLine();
        CustomerRepository.checkBalance(custCode);
    }

    private static void payOffLoan() {
        System.out.println("Enter code of the customer who wants to payoff");
        String custCode = scanner.nextLine();

        System.out.println("Enter amount to payoff");
        double payoff = Double.parseDouble(scanner.nextLine());
        CustomerRepository.loanPayoff(custCode, payoff);
    }

    private static  void filterHighDepositCustomer() {
        Collection<Customer> custs = CustomerRepository.getCustomersFromDatabase();
        List list = custs.stream().filter(cust->{
            return cust.getBalance() > 10000;
        }).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        String reply = null;

        do {
            System.out.println("What operation would you like to do?\n" +
                    "Enter 1 to Add new customer\n" +
                    "Enter 2 to Get Customer \n" +
                    "Enter 3 to Deposit \n" +
                    "Enter 4 to Withdraw\n" +
                    "Enter 5 to Overdraw on loan account\n" +
                    "Enter 6 to Check Balance\n" +
                    "Enter 7 to Pay Off\n" +
                    "Enter 8 to High deposit customers\n" +
                    "Enter Q to exit");

            reply = scanner.nextLine();

            switch (reply) {
                case "1":   addCustomerToDatabase();
                    break;
                case "2":   getCustomerFromDatabase();
                    break;
                case "3":   depositAmount();
                    break;
                case "4":   withdrawAmount();
                    break;
                case "5":   overdrawOnLoan();
                    break;
                case "6":   checkBalance();
                    break;
                case "7":   payOffLoan();
                    break;
                case "8":   filterHighDepositCustomer();
                    break;
                case "Q":
                    System.exit(0);
                default :
                    System.out.println("Invalid input. Try again");
            }
        } while(true);


    }
}
