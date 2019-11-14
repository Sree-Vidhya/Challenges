package Validation;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateFieldLayoutTest {
        FieldInput fieldInputMock = Mockito.mock(FieldInput.class);
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(fieldInputMock);

        @Test
        public void testStringInputReturnsFalse() {
            when(fieldInputMock.inputNextLine())
                    .thenReturn("a");
            assertEquals(false,validateFieldLayout.validateTheInput(fieldInputMock.inputNextLine()));
        }
        @Test
        public void testTwoIntegerReturnsTrue() {
            when(fieldInputMock.inputNextLine())
                    .thenReturn("44");
            assertEquals(true,validateFieldLayout .checkingifInputLengthIsTwo(fieldInputMock.inputNextLine()));
        }
        @Test
        public void testOneIntegerReturnsFalse() {
            when(fieldInputMock.inputNextLine())
                    .thenReturn("4");
            assertEquals(false,validateFieldLayout .checkingifInputLengthIsTwo(fieldInputMock.inputNextLine()));
        }
        @Test
        public void testEmptyInputReturnsFalse() {
            when(fieldInputMock.inputNextLine())
                    .thenReturn("");
            assertEquals(false,validateFieldLayout .validateTheInput(fieldInputMock.inputNextLine())); }
}