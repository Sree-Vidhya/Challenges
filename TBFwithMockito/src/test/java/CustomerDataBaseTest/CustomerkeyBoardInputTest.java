package CustomerDataBaseTest;

import org.junit.Test;

import static org.junit.Assert.*;


public class CustomerkeyBoardInputTest {

    @Test
    public void getNameReturnName() {
        String name = "Sreevidhya";
        String address = "1 Bob Avenue, Auckland";
        Customer customer = new Customer(name,address);
        assertEquals("Sreevidhya",customer.getName());
    }
    @Test
    public void getNameReturnNotValid() {
        String name = "";
        String address = "1 Bob Avenue, Auckland";
        Customer customer = new Customer(name,address);
        assertEquals("Not a valid Name!",customer.getName());
    }

    @Test
    public void getAddressReturnAddress() {
        String name = "Sreevidhya";
        String address = "1 Bob Avenue, Auckland";
        Customer customer = new Customer(name,address);
        assertEquals("1 Bob Avenue, Auckland",customer.getAddress());
    }
    @Test
    public void getAddressReturnsNotValid() {
        String name = "Sreevidhya";
        String address = "";
        Customer customer = new Customer(name,address);
        assertEquals("Not a valid Address!",customer.getAddress());
    }
    @Test
    public void generateCustId(){
        String name = "Sreevidhya";
        String address = "1 Bob Avenue, Auckland";
        Customer customer = new Customer(name,address);
        assertEquals(1,customer.getCustID());
    }
    @Test
    public void getCustomerWithCodeFromCustomerRepository()
    {
        Customer customer = new Customer("Sreevidhya","1 Bob Avenue, Auckland");
        CustomerRepository repo = new CustomerRepository();
        repo.addCustomertoDataBase(customer);
        MockCustomerKeyBoardInput keyboard = new MockCustomerKeyBoardInput("Sreevidhya","1 Bob Avenue, Auckland");
        Customer customerFromDB = keyboard.getCustomerWithCode(1);
        assertEquals(customer,customerFromDB);

    }
}
