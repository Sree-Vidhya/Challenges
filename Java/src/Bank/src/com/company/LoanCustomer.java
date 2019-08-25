package com.company;

public class LoanCustomer extends Customer {

    private String loanType;
    private double loanBalance;
    private static final String LOAN = "LOAN";

    public  static final String HOUSING = "HOUSING";
    public  static final String CAR = "CAR";
    public  static final String PERSONAL = "PERSONAL";

    public LoanCustomer(String firstName, String lastName, String email,
                        String addressForCommunication, String loanType, double loanAmount) {
        super(firstName,lastName,email,addressForCommunication,LOAN);
        this.loanType = loanType;
        this.loanBalance = loanAmount;
    }

    public void overDraw(double additionalLoan) {
        loanBalance+=additionalLoan; // else it doesn't let me payoff after overdraw.
    }

    public void payOff(double payOff) {
        loanBalance-=payOff; // else if doesn't reduce amount
    }

    @Override
    public double getBalance() {
        return loanBalance;// removed 0- because of this : if(cust.getBalance() >= payOff) { in customer repository
    }

    @Override
    public String toString() {
        return "LoanCustomer{" +
                "Customer Id='" + this.getCustId() + '\'' +
                ", First Name='" + this.getFirstName() + '\'' +
                ", Last Name='" + this.getLastName() + '\'' +
                ", Email='" + this.getEmail() + '\'' +
                ", Address For Communication='" + this.getAddressForCommunication() + '\'' +
                ", Customer Type='" + this.getCustType() + '\'' +
                ", Loan Type='" + loanType + '\'' +
                ", Loan Balance=" + loanBalance +
                '}';
    }
}
