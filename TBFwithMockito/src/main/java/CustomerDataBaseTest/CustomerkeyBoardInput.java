package CustomerDataBaseTest;

import java.util.Scanner;

public class CustomerkeyBoardInput implements CustomerInput {
    Scanner input = new Scanner(System.in);
    String name;
    String address;
    int custID;
    Customer getCustomer;
    Customer getCustomerwithCode;
    Customer customer;

    @Override
    public int generateNextCustId()
    {
        return generateCustomerDetailsFromTheInformationProvided().custID;

    }
    @Override
    public String getNameFromTheUser() {
        System.out.println("Please input your Name: ");
        String name = input.nextLine();
        return name;
    }

    @Override
    public String getAddressFromTheUser() {
        System.out.println("Please input your Address: ");
        String address = input.nextLine();
        return address;
    }
    public Customer generateCustomerDetailsFromTheInformationProvided()
    {
         customer = new Customer(name,address);
        return customer;
    }
    public int getCustIDToSearchInTheRepository()
    {
        System.out.println("Enter code of the customer to get their details");
        custID = input.nextInt();
        return custID;
    }

    @Override
    public Customer getCustomerWithCode(int custID) {
        getCustomer =  CustomerRepository.getCustomerFromDataBase(custID);
        return getCustomer;
    }

    @Override
    public Customer getCustomerFromDatabase() {
        getCustomerwithCode = getCustomerWithCode(custID);
        if(customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("No such customer in database");
        }
        return customer;
    }

    @Override
    public String toString() {
        return "CustomerkeyBoardInput{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
