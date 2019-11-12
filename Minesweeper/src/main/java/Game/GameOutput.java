package Game;

import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameOutput {
    FieldInput fieldInput = new FieldInput();
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(fieldInput);
    ValidateFieldContent validateFieldContent = new ValidateFieldContent(fieldInput);
    GameInput input;
    String userInput;
    int numOfRows;
    int numOfCols;
    int totalCells;
    ArrayList<String> cells;

    public GameOutput(GameInput input) {
        this.input = input;
    }
    public String[][] displayOutput()
    {
        userInput = input.matrixLayout();
        numOfRows = Integer.parseInt(input.calculationTheValueOfRowOrColumn(userInput,0));
        numOfCols = Integer.parseInt(input.calculationTheValueOfRowOrColumn(userInput,1));
        totalCells = input.totalNumberOfCells(userInput);
        cells = input.entireField();
        System.out.println(cells);
        String arr[][] = new String[numOfRows][numOfRows];
        int cell = 0;
        int i;
        int j;
        while(cell < totalCells)
        {
            for(i = 0; i<numOfRows;i++)
            {
                for(j=0;j<numOfCols;j++)
                {
                    arr[i][j] = cells.get(cell);
                    System.out.print(arr[i][j] + "\t");
                    cell++;
                }
                System.out.println("\n");
            }
        }
        return arr;
    }
    public void calc(String[][] arr)
    {
        System.out.println("#Output");
        System.out.println("-------");
        int value =0;
        for(int i = 0; i<numOfRows;i++)
        {
            for(int j=0;j<numOfCols;j++)
            {
                if(!(arr[i][j].equals("."))){
                    System.out.print(arr[i][j]+"\t");

                }
                else {
                    System.out.print(Integer.toString(value) + "\t");
                }
            }
            System.out.println("\n");
        }
        System.out.println("did it!");
    }
}
