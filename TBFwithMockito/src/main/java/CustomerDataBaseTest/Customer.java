package CustomerDataBaseTest;

public class Customer {
    public int custID = 0;
    String name;
    String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getCustID() {
        return ++custID;
    }
    public String validateName() {
        if (name.matches( "[a-zA-z[0-9]]+([ '-][a-zA-Z]+)*" ))
        {
            return name;
        }
        else
        {
            try {
                throw new Exception("Not a valid Name!");

            } catch (Exception e) {
                e.printStackTrace();
                name = "Not a valid Name!";
            }
        }
        return name;
    }
    public String getName() {
        return validateName();
    }
    public String validateAddress() {
        if ((address.matches("^[#.0-9a-zA-Z\\s,-]+$")))
        {
            return address;
        }
        else
        {
            try {
                throw new Exception("Not a valid Address!");

            } catch (Exception e) {
                e.printStackTrace();
                address = "Not a valid Address!";
            }
        }
    return address;
    }
    public String getAddress() {
        return validateAddress();
    }
}

