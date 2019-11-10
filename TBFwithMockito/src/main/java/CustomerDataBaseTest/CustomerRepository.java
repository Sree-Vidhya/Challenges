package CustomerDataBaseTest;

import java.util.HashMap;

public class CustomerRepository {
    private  static HashMap<Integer,Customer> customerDataBase = new HashMap<>();

    public static void addCustomertoDataBase(Customer customer)
    {
        customerDataBase.put(customer.getCustID(),customer);
    }
    public static Customer getCustomerFromDataBase(Integer custId)
    {
        return customerDataBase.get(custId);

    }
}
