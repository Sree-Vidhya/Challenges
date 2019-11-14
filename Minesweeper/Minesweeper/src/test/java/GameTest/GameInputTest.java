package GameTest;

import Field.FieldLayout;
import Game.GameInput;
import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameInputTest {
    FieldInput fieldInputMock = Mockito.mock(FieldInput.class);
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(fieldInputMock);
    ValidateFieldLayout validateFieldLayoutMock = Mockito.mock(ValidateFieldLayout.class);
    ValidateFieldContent validateFieldContentMock = Mockito.mock(ValidateFieldContent.class);
    FieldLayout fieldLayoutMock = Mockito.mock(FieldLayout.class);
    GameInput gameInput = new GameInput(fieldInputMock,validateFieldLayout,validateFieldContentMock);
    @Test
    public void returnsfieldLayout() {
        when(fieldInputMock.inputNextLine())
                .thenReturn("22");
        assertEquals("22", gameInput.fieldLayout());
    }
    @Test
    public void returnTotalNumberOfCells(){
        when(fieldInputMock.inputNextLine())
                .thenReturn("22");
        gameInput.fieldLayout();
        when(validateFieldLayoutMock.validateTheFormatandLength(fieldInputMock.inputNextLine())).thenReturn(true);
        when(fieldLayoutMock.calculatingNumberOfRows("22")).thenReturn(2);
        when(fieldLayoutMock.calculatingNumberOfColumns("22")).thenReturn(2);
        assertEquals(4, gameInput.totalNumberOfCells(fieldInputMock.inputNextLine()));
    }

    @Test
    public void returnsArrayListForField(){
        ArrayList<String> testField = new ArrayList<String>();
        testField.add(".");
        testField.add("*");
        testField.add(".");
        testField.add(".");
        when(fieldInputMock.inputNextLine())
                .thenReturn("22");
        gameInput.fieldLayout();
        when(validateFieldLayoutMock.validateTheFormatandLength(fieldInputMock.inputNextLine())).thenReturn(true);
        when(fieldLayoutMock.calculatingNumberOfRows("22")).thenReturn(2);
        when(fieldLayoutMock.calculatingNumberOfColumns("22")).thenReturn(2);
        when(validateFieldContentMock.userFieldInput(4)).thenReturn(testField);
    assertEquals(testField, gameInput.entireField());
    }

}

