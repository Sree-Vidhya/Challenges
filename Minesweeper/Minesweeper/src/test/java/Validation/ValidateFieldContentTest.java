package Validation;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateFieldContentTest {
    FieldInput fieldInputMock = Mockito.mock(FieldInput.class);
    ValidateFieldContent validateFieldContent = new ValidateFieldContent(fieldInputMock);
    @Test
    public void validInputReturnsTrue()
    {
        assertEquals(true,validateFieldContent.validateTheInput("."));
        assertEquals(true,validateFieldContent.validateTheInput("*"));
    }
    @Test
    public void invalidInputReturnsFalse()
    {
        assertEquals(false,validateFieldContent.validateTheInput("a"));
    }
    @Test
    public void emptyInputReturnsFalse()
    {
        assertEquals(false,validateFieldContent.validateTheInput(""));
    }

    @Test
    public void testFieldCreated(){
        ArrayList<String> testFieldContent = new ArrayList<String>();
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        testFieldContent.add(".");
        when(fieldInputMock.inputSameLine())
                .thenReturn(".")
                .thenReturn("*")
                .thenReturn(".")
                .thenReturn(".");
        assertEquals(testFieldContent,validateFieldContent.userFieldInput(4));
    }
}
