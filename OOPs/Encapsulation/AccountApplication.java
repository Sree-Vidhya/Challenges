package OOPs.Encapsulation;

public class AccountApplication
{
    public static void main(String[] args) {
        //creating instancdes of a class
        Account acc = new Account();
        //setting values to the setter method
        acc.setAcc_no(123456789);
        acc.setName("SreeVidhya");
        acc.setEmail("sree.vidhya@myob.com");
        acc.setAmount(65000);
        //getting the values using getter methods.
        System.out.println("Name: " + acc.getName()+ "\n" + "Email: " + acc.getEmail()+ "\n" + "Account no.:  " + acc.getAcc_no()+ "\n" + "Amount: " + acc.getAmount()+ "\n");
    }
}
