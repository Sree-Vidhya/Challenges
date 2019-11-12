package GameTest;

import Game.GameInput;
import Game.GameOutput;
import Validation.FieldInput;
import org.junit.Test;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GameOutputTest {
    GameInput input = Mockito.mock(GameInput.class);
    FieldInput fieldInput = Mockito.mock(FieldInput.class);
    GameOutput output = new GameOutput(input);

    @Test
    public void displayOutput()
    {
        ArrayList<String> field = new ArrayList();
        field.add(".");
        field.add("*");
        field.add(".");
        field.add(".");
        when(fieldInput.inputNextLine()).thenReturn("22");
        when(fieldInput.inputSameLine()).thenReturn(".")
                .thenReturn("*")
                .thenReturn(".")
                .thenReturn(".");
        when(input.matrixLayout()).thenReturn("22");
        when(input.calculationTheValueOfRowOrColumn("22",0)).thenReturn("2");
        when(input.calculationTheValueOfRowOrColumn("22",1)).thenReturn("2");
        when(input.totalNumberOfCells("22")).thenReturn(4);
        when(input.entireField()).thenReturn(field);
        String[][] arr = {{".","*"},{".","."}};
        assertEquals(arr,output.displayOutput());
    }
    @Test
    public void calc()throws Exception
    {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));
        String[][] arr = {{".","*"},{".","."}};
        output.calc(arr);
        bo.flush();
        String allWrittenLines = new String(bo.toByteArray());
        assertEquals(true,allWrittenLines.contains("did it!"));
    }
}
