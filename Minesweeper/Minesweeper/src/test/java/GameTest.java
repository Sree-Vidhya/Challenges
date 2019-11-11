
import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameTest {
    FieldInput inputMock = Mockito.mock(FieldInput.class);
    ValidateFieldLayout validateLayout = new ValidateFieldLayout(inputMock);
    ValidateFieldLayout layoutMock = Mockito.mock(ValidateFieldLayout.class);
    ValidateFieldContent contentMock = Mockito.mock(ValidateFieldContent.class);
    Game game = new Game(inputMock,validateLayout,contentMock);
    @Test
    public void returnslayoutmxn() {
        when(inputMock.inputNextLine())
                .thenReturn("22");
        assertEquals("22",game.matrixLayout());
    }
    @Test
    public void returnTotalNumberOfCells(){
        when(inputMock.inputNextLine())
                .thenReturn("22");
        game.matrixLayout();
        when(layoutMock.validateTheFormatandLength(inputMock.inputNextLine())).thenReturn(true);
        when(contentMock.calculateToTalNumberofcells(inputMock.inputNextLine())).thenReturn(4);
        assertEquals(4,game.totalNumberOfCells(inputMock.inputNextLine()));
    }
    @Test
    public void returnsArrayList(){
        ArrayList<String> testField = new ArrayList<String>();
        testField.add(".");
        testField.add("*");
        testField.add(".");
        testField.add(".");
        when(inputMock.inputNextLine())
                .thenReturn("22");
        game.matrixLayout();
        when(layoutMock.validateTheFormatandLength(inputMock.inputNextLine())).thenReturn(true);
        when(contentMock.calculateToTalNumberofcells(inputMock.inputNextLine())).thenReturn(4);
        when(contentMock.fieldCreated(4)).thenReturn(testField);
    assertEquals(testField,game.entireField());
    }

}
