package Validation;


public class ValidateFieldLayout implements ValidateUserInput {

    FieldInput fieldInput;


    public ValidateFieldLayout(FieldInput fieldInput) {
        this.fieldInput = fieldInput;
    }

    public boolean validateTheInput(String inputToValidate) {
        try {
            Integer.parseInt(inputToValidate);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public boolean checkingifInputLengthIsTwo(String inputToValidate)
    {
        if(inputToValidate.length() == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean validateTheFormatandLength(String inputToValidate)
    {
        boolean validation = false;
        if(validateTheInput(inputToValidate) == true)
        {
            validation =  checkingifInputLengthIsTwo(inputToValidate);
        }
        return validation;
    }
    public String enterFieldLayout()
    {
        String fieldLayout = fieldInput.inputNextLine();

        while(validateTheFormatandLength(fieldLayout) == false)
        {
            System.out.println("Not a Valid integer. Try Again!.");
            fieldLayout = fieldInput.inputNextLine();
        }
        return fieldLayout;
    }
}
