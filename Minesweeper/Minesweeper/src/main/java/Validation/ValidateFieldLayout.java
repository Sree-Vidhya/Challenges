package Validation;

import java.util.Scanner;

public class ValidateFieldLayout implements ValidateUserInput {

    Scanner input = new Scanner(System.in);

    public boolean validateTheInput(String valueToValidate) {
        try {
            Integer.parseInt(valueToValidate);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public boolean checkingifInputLengthIsTwo(String fieldLayout)
    {
        if(fieldLayout.length() == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean validateTheFormatandLength(String valueToValidate)
    {
        boolean validation = false;
        if(validateTheInput(valueToValidate) == true)
        {
            validation =  checkingifInputLengthIsTwo(valueToValidate);
        }
        return validation;
    }
    public String enterFieldLayout()
    {
        String fieldLayout = input.nextLine();
        while(validateTheFormatandLength(fieldLayout) == false)
        {
            System.out.println("Not a Valid integer. Try Again!.");
            fieldLayout = input.nextLine();
        }
        return fieldLayout;
    }
}
