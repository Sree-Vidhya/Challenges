package Game;

import Field.FieldLayout;
import Game.GameLogic.LogicForAdjacentCells;
import Validation.FieldInput;

import java.util.ArrayList;

public class GameOutput {
    String userEnteredFieldLayout;
    FieldLayout fieldLayout = new FieldLayout(userEnteredFieldLayout);;
    GameInput gameInput;
    LogicForAdjacentCells logicForAdjacentCells;

    public GameOutput(GameInput gameInput, LogicForAdjacentCells logicForAdjacentCells) {
        this.gameInput = gameInput;
        this.logicForAdjacentCells = logicForAdjacentCells;
    }

    public String displayOutput(GameInput gameInput) {
        StringBuilder matrixFormat = new StringBuilder();
        userEnteredFieldLayout = gameInput.fieldLayout();
        ArrayList cells =gameInput.entireField();
        ArrayList mines = logicForAdjacentCells.collectMines(userEnteredFieldLayout,cells);
        int numOfRows = fieldLayout.calculatingNumberOfRows(userEnteredFieldLayout);
        int numOfCols = fieldLayout.calculatingNumberOfColumns(userEnteredFieldLayout);
        int totalCells = (numOfRows*numOfCols);
        ArrayList<String> mineAndSafeZone = logicForAdjacentCells.calculatingAllTheCellLocation(userEnteredFieldLayout, mines,cells,totalCells);
        int cell = 0;
        int currentRow;
        while (cell < totalCells) {
            for (currentRow = 0; currentRow < numOfRows; currentRow++) {
                matrixFormat.append(mineAndSafeZone.get(cell) + "\t");
                    cell++;
                }
            matrixFormat.append("\n");
            }
        System.out.println(matrixFormat.toString());
        return matrixFormat.toString();
    }
}
