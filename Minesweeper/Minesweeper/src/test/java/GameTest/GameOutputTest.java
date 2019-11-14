package GameTest;

import Field.FieldLayout;
import Game.GameInput;
import Game.GameLogic.LogicForAdjacentCells;
import Game.GameOutput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GameOutputTest {
    ArrayList cells = new ArrayList();
    FieldLayout fieldLayoutMock = Mockito.mock(FieldLayout.class);
    GameInput gameInputMock = Mockito.mock(GameInput.class);
    LogicForAdjacentCells logicForAdjacentCellsMock = Mockito.mock(LogicForAdjacentCells.class);
    GameOutput gameOutput = new GameOutput(gameInputMock,logicForAdjacentCellsMock);
    @Test
    public void testdisplayOutput()
    {
        StringBuilder expected = new StringBuilder();
        cells.add("*");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add(".");
        cells.add("*");
        when(gameInputMock.entireField()).thenReturn(cells);
        ArrayList mine = new ArrayList();
        mine.add(0);
        mine.add(7);
        ArrayList nextCell = new ArrayList();
        nextCell.add("*");
        nextCell.add("1");
        nextCell.add(".");
        nextCell.add("1");
        nextCell.add("1");
        nextCell.add("1");
        nextCell.add(".");
        nextCell.add("1");
        nextCell.add("*");
        when(gameInputMock.fieldLayout()).thenReturn("33");
        when(fieldLayoutMock.calculatingNumberOfRows("33")).thenReturn(3);
        when(fieldLayoutMock.calculatingNumberOfColumns("33")).thenReturn(3);
        when(logicForAdjacentCellsMock.collectMines("33",cells)).thenReturn(mine);
        when(logicForAdjacentCellsMock.calculatingAllTheCellLocation("33",mine,cells,9)).thenReturn(nextCell);
        int cell = 0;
        int i;
        while (cell < 9) {
            for (i = 0; i < 3; i++) {
                expected.append(nextCell.get(cell) +"\t");
                cell++;
            }
            expected.append(("\n"));
        }
        assertEquals(expected.toString(),gameOutput.displayOutput(gameInputMock));
    }
}
