package Game;

import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;

import java.util.ArrayList;
public class GameInput {
    ArrayList<String> zone;
    String layoutValues;
    FieldInput input;
    ValidateFieldLayout validateLayout;
    ValidateFieldContent validateContent;

    public GameInput(FieldInput input, ValidateFieldLayout validateLayout, ValidateFieldContent validateContent) {
        this.input = input;
        this.validateLayout = validateLayout;
        this.validateContent = validateContent;
    }

    public String matrixLayout() {
        layoutValues =   validateLayout.enterFieldLayout();
        return layoutValues;
    }
    public int totalNumberOfCells(String gridLayout){
        return validateContent.calculateToTalNumberofcells(layoutValues);
    }
    public String calculationTheValueOfRowOrColumn(String layout,int i)
    {
        String[] fieldLayout = (layout.split(""));
        String valueOfRowOrColumns = (fieldLayout[i]);
        return valueOfRowOrColumns;
    }
    public ArrayList<String> entireField(){
        return validateContent.fieldCreated(totalNumberOfCells(layoutValues));
    }

}