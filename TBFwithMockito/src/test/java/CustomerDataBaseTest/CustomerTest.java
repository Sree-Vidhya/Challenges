package CustomerDataBaseTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void getCustIDReturnsNextCustID() {
        Customer cust = new Customer("Sree Vidhya","601, 32BraySt, South Yarra, VIC, AU");
        assertEquals(1,cust.getCustID());
    }

    @Test
    public void getNameReturnName() {
        Customer cust = new Customer("Sree Vidhya","601, 32BraySt, South Yarra, VIC, AU");
        assertEquals("Sree Vidhya",cust.getName());
    }
    @Test
    public void getNameReturnNotAValidName() {
        Customer cust = new Customer("!! Vidhya","601, 32BraySt, South Yarra, VIC, AU");
        assertEquals("Not a valid Name!",cust.getName());
    }
    @Test
    public void getNameReturnNotAValidNameWhenInputIsEmpty() {
        Customer cust = new Customer("","601, 32BraySt, South Yarra, VIC, AU");
        assertEquals("Not a valid Name!",cust.getName());
    }

    @Test
    public void getAddressReturnAddress() {
        Customer cust = new Customer("Sree Vidhya","1 Bob Avenue, Auckland");
        assertEquals("1 Bob Avenue, Auckland",cust.getAddress());
    }
    @Test
    public void getAddressThrowsExceptionWhenAddressIsEmpty() {
        Customer cust = new Customer("Sree Vidhya","");
        assertEquals("Not a valid Address!",cust.getAddress());
    }
}
