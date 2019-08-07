public class FirstClass {

    public static void main(String[] args) {
//        System.out.println("Hello from Intellij");
        Customer cust1 = new Customer("sree","vidhya", "sreevidhya","6111111","personal","Bray st",20);
        cust1.firstName="Sree";
        cust1.secondName ="Vidhya";
        cust1.email="sree.vidhya@myob.com";
        cust1.accountNumber="6111111";
        cust1.accountType="personal";
        cust1.address="Bray st";
        cust1.age=20;
        System.out.println(cust1);
    }
}
