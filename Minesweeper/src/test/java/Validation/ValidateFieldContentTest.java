package Validation;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateFieldContentTest {
    FieldInput fieldInputMock = Mockito.mock(FieldInput.class);
    ValidateFieldLayout validateLayout = new ValidateFieldLayout(fieldInputMock);
    ValidateFieldContent field = new ValidateFieldContent(fieldInputMock);
    @Test
    public void validInputReturnsTrue()
    {
        assertEquals(true,field.validateTheInput("."));
        assertEquals(true,field.validateTheInput("*"));
    }
    @Test
    public void invalidInputReturnsFalse()
    {
        assertEquals(false,field.validateTheInput("a"));
    }
    @Test
    public void emptyInputReturnsFalse()
    {
        assertEquals(false,field.validateTheInput(""));
    }
    @Test
    public void doubleIntegerReturnsTotalNumberOfCells()
    {
        assertEquals(4,field.calculateToTalNumberofcells("22"));
    }
    @Test
    public void invalidInputReturnsZero()
    {
        assertEquals(0,field.calculateToTalNumberofcells("a"));
        assertEquals(0,field.calculateToTalNumberofcells("aa"));
        assertEquals(0,field.calculateToTalNumberofcells("2"));
    }
    @Test
    public void emptyInputReturnsZero()
    {
        assertEquals(0,field.calculateToTalNumberofcells(""));
    }

    @Test
    public void testFieldCreated(){
        ArrayList<String> testField = new ArrayList<String>();
        testField.add(".");
        testField.add("*");
        testField.add(".");
        testField.add(".");
        when(fieldInputMock.inputSameLine())
                .thenReturn(".")
                .thenReturn("*")
                .thenReturn(".")
                .thenReturn(".");
        assertEquals(testField,field.fieldCreated(4));
    }
}
