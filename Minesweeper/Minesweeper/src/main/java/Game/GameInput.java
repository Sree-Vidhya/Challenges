package Game;

import Field.FieldLayout;
import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;

import java.util.ArrayList;
public class GameInput {
    String userEnteredFieldLayout;
    FieldInput fieldInput;
    ValidateFieldLayout validateFieldLayout;
    ValidateFieldContent validateFieldContent;
    FieldLayout fieldLayout;

    public GameInput(FieldInput fieldInput, ValidateFieldLayout validateFieldLayout, ValidateFieldContent validateFieldContent) {
        this.fieldInput = fieldInput;
        this.validateFieldLayout = validateFieldLayout;
        this.validateFieldContent = validateFieldContent;
    }

    public String fieldLayout() {
        userEnteredFieldLayout =   validateFieldLayout.enterFieldLayout();
        return userEnteredFieldLayout;
    }
    public int totalNumberOfCells(String userEnteredFieldLayout){
        fieldLayout = new FieldLayout(userEnteredFieldLayout);
        int numberOfRows = fieldLayout.calculatingNumberOfRows(userEnteredFieldLayout);
        int numberOfColumns = fieldLayout.calculatingNumberOfColumns(userEnteredFieldLayout);
        return (numberOfRows*numberOfColumns);

    }
    public ArrayList<String> entireField(){
        return validateFieldContent.userFieldInput(totalNumberOfCells(userEnteredFieldLayout));
    }

}