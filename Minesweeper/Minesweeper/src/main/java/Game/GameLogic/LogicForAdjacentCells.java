package Game.GameLogic;

import Field.FieldLayout;
import Game.GameInput;

import java.util.ArrayList;

public class LogicForAdjacentCells {
    GameInput gameInput;
    ArrayList<Integer> mine = new ArrayList<Integer>();
    int totalCells;
    String userEnteredFieldLayout;
    FieldLayout fieldLayout = new FieldLayout(userEnteredFieldLayout);
    public LogicForAdjacentCells(GameInput gameInput) {
        this.gameInput = gameInput;
    }

    public ArrayList collectMines(String userEnteredFieldLayout,ArrayList cells) {
        totalCells = gameInput.totalNumberOfCells(userEnteredFieldLayout);
        int mineAdded = 0;
        System.out.println(cells);
        while (mineAdded < totalCells) {
            if (cells.get(mineAdded).equals("*")) {
                mine.add(mineAdded);
            }
            mineAdded++;
        }
        System.out.println();
        return mine;
    }

    public ArrayList<String> calculatingAllTheCellLocation(String gridLayout, ArrayList mine,ArrayList cells,int totalCells) {
        int numOfRows = fieldLayout.calculatingNumberOfRows(gridLayout);
        int numOfCols = fieldLayout.calculatingNumberOfColumns(gridLayout);
        int zone = 1;
        System.out.println(numOfRows);
        System.out.println(numOfCols);
        System.out.println("Output:");
        System.out.println("--------");
        for (int eachMine = 0; eachMine < mine.size(); eachMine++) {
            int mineZone = individualMines(mine,eachMine);
            if (mineZone == 0) {
                cellsAdjacentToMineInFourCorners((mineZone + 1), (mineZone + numOfCols), (mineZone + (numOfCols + 1)), cells, zone);
            } else if (mineZone == (numOfCols - 1)) {
                cellsAdjacentToMineInFourCorners((mineZone - 1), (mineZone + numOfCols), (mineZone + (numOfCols - 1)), cells, zone);
            } else if (mineZone == (totalCells - 1)) {
                cellsAdjacentToMineInFourCorners((mineZone - 1), (mineZone - numOfCols), (mineZone - (numOfCols + 1)), cells, zone);
            } else if (mineZone == (totalCells - numOfCols)) {
                cellsAdjacentToMineInFourCorners((mineZone + 1), (mineZone - numOfCols), (mineZone - (numOfCols - 1)), cells, zone);
            } else if ((mineZone > 0) && (mineZone < (numOfCols - 1))) {
                cellsAdjacentToMineInTheMiddleOfLastRowandCorner((mineZone + 1), (mineZone - 1), (mineZone + numOfCols), (mineZone + (numOfCols + 1)), (mineZone + (numOfCols - 1)), cells, zone);
            } else if ((mineZone > (totalCells - numOfCols)) && (mineZone < (totalCells - 1))) {
                cellsAdjacentToMineInTheMiddleOfLastRowandCorner((mineZone + 1), (mineZone - 1), (mineZone - numOfCols), (mineZone - (numOfCols + 1)), (mineZone - (numOfCols - 1)), cells, zone);
            } else if ((mineZone % numOfRows) == 0) {
                cellsAdjacentToMineInTheMiddleOfLastRowandCorner((mineZone + 1), (mineZone + numOfCols), (mineZone - numOfCols), (mineZone - (numOfCols - 1)), (mineZone + (numOfCols + 1)), cells, zone);
            } else if (((mineZone - (numOfCols - 1)) % numOfRows) == 0) {
                cellsAdjacentToMineInTheMiddleOfLastRowandCorner((mineZone - 1), (mineZone + numOfCols), (mineZone - numOfCols), (mineZone - (numOfCols - 1)), (mineZone + (numOfCols - 1)), cells, zone);
            }else if ((mineZone > (numOfCols - 1)) && (mineZone < (totalCells - numOfCols))) {
                cellsAdjacentToMineInTheMiddle((mineZone + 1), (mineZone - 1), (mineZone + numOfCols), (mineZone - numOfCols), (mineZone + (numOfCols + 1)), (mineZone + (numOfCols - 1)), (mineZone - (numOfCols + 1)), (mineZone - (numOfCols - 1)), cells, zone);
            }
            placingMineInTheirCell(mine,cells);
        }
        System.out.println(cells);
        return cells;
    }

    public ArrayList cellsAdjacentToMineInFourCorners(int nextRowCell, int prevRowCell, int diagonalCell, ArrayList cells, int zone) {
        cells.set((nextRowCell), Integer.toString(zone));
        cells.set((prevRowCell), Integer.toString(zone));
        cells.set((diagonalCell), Integer.toString(zone));
        return cells;
    }

    public ArrayList cellsAdjacentToMineInTheMiddleOfLastRowandCorner(int nextRowCell, int prevRowCell, int nextColumnCell, int diagonalNextCell, int diagonalPrevCell, ArrayList cells, int zone) {
        cells.set(nextRowCell, Integer.toString(zone));
        cells.set(prevRowCell, Integer.toString(zone));
        cells.set(nextColumnCell, Integer.toString(zone));
        cells.set(diagonalNextCell, Integer.toString(zone));
        cells.set(diagonalPrevCell, Integer.toString(zone));
        return cells;
    }

    public ArrayList cellsAdjacentToMineInTheMiddle(int nextRowCell, int prevRowCell, int nextColumnCell, int prevColumnCell, int diagonalNextRightCell, int diagonalPrevRightCell, int diagonalNextLeftCell, int diagonalPrevLeftCell, ArrayList cells, int zone) {
        cells.set(nextRowCell, Integer.toString(zone));
        cells.set(prevRowCell, Integer.toString(zone));
        cells.set(nextColumnCell, Integer.toString(zone));
        cells.set(prevColumnCell, Integer.toString(zone));
        cells.set(diagonalNextRightCell, Integer.toString(zone));
        cells.set(diagonalPrevRightCell, Integer.toString(zone));
        cells.set(diagonalNextLeftCell, Integer.toString(zone));
        cells.set(diagonalPrevLeftCell, Integer.toString(zone));
        return cells;
    }

    public ArrayList placingMineInTheirCell(ArrayList mine, ArrayList cells) {
        for (int i = 0; i < mine.size(); i++) {
            cells.set((Integer) mine.get(i), "*");
        }
        return cells;
    }
    public int individualMines(ArrayList mine, int eachMine)
    {
        return Integer.parseInt(String.valueOf(mine.get(eachMine)));
    }
}


