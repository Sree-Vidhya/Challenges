package GameTest.GameLogicTest;

import Field.FieldLayout;
import Game.GameInput;
import Game.GameLogic.LogicForAdjacentCells;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class LogicForAdjacentCellsTest {
    GameInput gameInputMock = Mockito.mock(GameInput.class);
    LogicForAdjacentCells logicForAdjacentCells = new LogicForAdjacentCells(gameInputMock);
    ArrayList<String> cells = new ArrayList<String>();
    ArrayList<Integer> mine = new ArrayList<Integer>();
    int totalCells;
    String userEnteredFieldLayout;
    FieldLayout fieldLayoutMock = Mockito.mock(FieldLayout.class);
    @Test
    public void calculateMinesReturnsArrayListWithMines() {
    when(gameInputMock.fieldLayout()).thenReturn("22");
        userEnteredFieldLayout = gameInputMock.fieldLayout();
    when(gameInputMock.totalNumberOfCells(userEnteredFieldLayout)).thenReturn(4);
    totalCells = gameInputMock.totalNumberOfCells(userEnteredFieldLayout);
        cells.add(".");
        cells.add("*");
        cells.add(".");
        cells.add(".");
    when(gameInputMock.entireField()).thenReturn(cells);
    mine.add(1);
    assertEquals(mine,logicForAdjacentCells.collectMines(userEnteredFieldLayout,cells));
    }

   @Test
    public void calculatingBottomLeftCornerCellsReturnsOneForValuesOfAdjacentCells(){
       cells.add("*");
       cells.add(".");
       cells.add(".");
       cells.add(".");
       ArrayList expected = new ArrayList();
       expected.add("*");
       expected.add("1");
       expected.add("1");
       expected.add("1");
       int numOfCols = 2;
       int value = 0;
        assertEquals(expected,logicForAdjacentCells.cellsAdjacentToMineInFourCorners((value+1),(value + numOfCols),(value + (numOfCols + 1)),cells,1));
   }
    @Test
    public void calculatingCentreLeftCornerCellsReturnsOneForValuesOfAdjacentCells(){
        cells.add(".");
        cells.add("*");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        ArrayList expected = new ArrayList();
        expected.add("1");
        expected.add("*");
        expected.add("1");
        expected.add("1");
        expected.add("1");
        expected.add("1");
        expected.add(".");
        expected.add(".");
        expected.add(".");
        int numOfCols = 3;
        int value = 1;
        assertEquals(expected,logicForAdjacentCells.cellsAdjacentToMineInTheMiddleOfLastRowandCorner((value + 1),(value - 1),(value + numOfCols),(value + (numOfCols + 1)),(value + (numOfCols - 1)),cells,1));
    }
    @Test
    public void calculatingMiddleCellsReturnsOneForValuesOfAdjacentCells(){
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add("*");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        ArrayList expected = new ArrayList();
        expected.add("1");
        expected.add("1");
        expected.add("1");
        expected.add("1");
        expected.add("*");
        expected.add("1");
        expected.add("1");
        expected.add("1");
        expected.add("1");
        int numOfCols = 3;
        int value = 4;
        assertEquals(expected,logicForAdjacentCells.cellsAdjacentToMineInTheMiddle((value + 1),(value - 1),(value + numOfCols),(value - numOfCols), (value + (numOfCols + 1)),(value + (numOfCols - 1)),(value - (numOfCols + 1)),(value - (numOfCols - 1)),cells, 1));
    }
    @Test
    public void returningMinesBackToTheirCell()
    {
        mine.add(2);
        cells.add("1");
        cells.add("1");
        cells.add("1");
        cells.add("1");
        ArrayList expected = new ArrayList();
        expected.add("1");
        expected.add("1");
        expected.add("*");
        expected.add("1");
        assertEquals(expected,logicForAdjacentCells.placingMineInTheirCell(mine,cells));

    }
        @Test
    public void calculatingAdjacentCellsReturnsAdjecentCells() {
            when(gameInputMock.fieldLayout()).thenReturn("33");
            userEnteredFieldLayout = gameInputMock.fieldLayout();
            when(fieldLayoutMock.calculatingNumberOfRows("33")).thenReturn(3);
            when(fieldLayoutMock.calculatingNumberOfColumns("33")).thenReturn(3);
            cells.add("*");
            cells.add(".");
            cells.add(".");
            cells.add(".");
            cells.add(".");
            cells.add(".");
            cells.add(".");
            cells.add(".");
            cells.add("*");
            mine.add(0);
            mine.add(8);
            ArrayList expected = new ArrayList();
            expected.add("*");
            expected.add("1");
            expected.add(".");
            expected.add("1");
            expected.add("1");
            expected.add("1");
            expected.add(".");
            expected.add("1");
            expected.add("*");
        assertEquals(expected,logicForAdjacentCells.calculatingAllTheCellLocation("33",mine,cells,9));

    }
    @Test
    public void individualMinesReturnsSingleMineZone(){
        ArrayList mine = new ArrayList();
        mine.add(0);
        mine.add(1);
        mine.add(2);
        assertEquals(1,logicForAdjacentCells.individualMines(mine,1));
    }
}
