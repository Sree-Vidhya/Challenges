package CustomerDataBaseTest;

public interface CustomerInput{
    String getNameFromTheUser();
    String getAddressFromTheUser();
    int generateNextCustId();
    Customer generateCustomerDetailsFromTheInformationProvided();
    Customer getCustomerWithCode(int custID);
    Customer getCustomerFromDatabase();
}
