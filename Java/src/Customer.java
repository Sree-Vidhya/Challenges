public class Customer {
    String firstName;
    String secondName;
    String email;
    String accountNumber;
    String accountType;
    String address;
    int age;

    public Customer(String firstName, String secondName, String email, String accountNumber, String accountType, String address, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
//    public Customer() {
//        System.out.println("Customer is being constructed");
//    }

}
