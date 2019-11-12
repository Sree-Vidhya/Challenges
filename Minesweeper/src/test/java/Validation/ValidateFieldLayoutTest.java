package Validation;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ValidateFieldLayoutTest {
        FieldInput inputMock = Mockito.mock(FieldInput.class);
    ValidateFieldLayout validateUserInput = new ValidateFieldLayout(inputMock);

        @Test
        public void testStringInputReturnsFalse() {
            when(inputMock.inputNextLine())
                    .thenReturn("a");
            ValidateFieldLayout validateUserInput = new ValidateFieldLayout(inputMock);
            assertEquals(false,validateUserInput.validateTheInput(inputMock.inputNextLine()));
        }
        @Test
        public void testTwoIntegerReturnsTrue() {
            when(inputMock.inputNextLine())
                    .thenReturn("44");
            assertEquals(true,validateUserInput.checkingifInputLengthIsTwo(inputMock.inputNextLine()));
        }
        @Test
        public void testOneIntegerReturnsFalse() {
            when(inputMock.inputNextLine())
                    .thenReturn("4");
            assertEquals(false,validateUserInput.checkingifInputLengthIsTwo(inputMock.inputNextLine()));
        }
        @Test
        public void testEmptyInputReturnsFalse() {
            when(inputMock.inputNextLine())
                    .thenReturn("");
            assertEquals(false,validateUserInput.validateTheInput(inputMock.inputNextLine())); }
}