package Validation;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ValidateFieldContent implements ValidateUserInput
{
    ArrayList field;
    String eachCell;
    FieldInput fieldInput;

    public ValidateFieldContent(FieldInput fieldInput) {
        this.field = new ArrayList();
        this.fieldInput = fieldInput;
    }

    public boolean validateTheInput(String input) {
        if(input.equals(".") ||input.equals("*") ){
            return true;
        }
        else{
            return false;
        }
    }

    public int calculateToTalNumberofcells( String fieldLayout)
    {
        int totalNumberOfCells = 0;
        ValidateFieldLayout gridLayout = new ValidateFieldLayout(fieldInput);
        if(gridLayout.validateTheFormatandLength(fieldLayout) == true) {
            String[] layout = (fieldLayout.split(""));
            int numberOfRows = Integer.parseInt(layout[0]);
            int numberOfColumns = Integer.parseInt(layout[1]);
            totalNumberOfCells = numberOfRows * numberOfColumns;
        }
        return totalNumberOfCells;
    }
    public ArrayList<String> fieldCreated(int totalNumberOfCells){

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
