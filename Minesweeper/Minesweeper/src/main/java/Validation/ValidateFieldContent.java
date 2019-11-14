package Validation;

import java.util.ArrayList;

public class ValidateFieldContent implements ValidateUserInput
{
    ArrayList field = new ArrayList();
    String eachCell;
    FieldInput fieldInput;

    public ValidateFieldContent(FieldInput fieldInput) {
        this.fieldInput = fieldInput;
    }

    public boolean validateTheInput(String inputToValidate) {
        if(inputToValidate.equals(".") ||inputToValidate.equals("*") ){
            return true;
        }
        else{
            return false;
        }
    }
    public ArrayList<String> userFieldInput(int totalNumberOfCells){

        System.out.println("Enter the Input for Each Cell: \n'.' for safe zone.\n'*' for mine zone");
        for(int i =0 ; i < totalNumberOfCells ; i++) {
            eachCell = fieldInput.inputSameLine();
            while (validateTheInput(eachCell) == false) {
                System.out.println("Not a Valid Input");
                eachCell = fieldInput.inputSameLine();
            }
            field.add(eachCell);
        }
        return field;
    }
}
