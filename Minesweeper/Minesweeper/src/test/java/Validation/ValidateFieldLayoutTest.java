package Validation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateFieldLayoutTest {
        ValidateFieldLayout validateUserInput = new ValidateFieldLayout();
        @Test
        public void testStringInputReturnsFalse() {
            assertEquals(false,validateUserInput.validateTheInput("a"));
        }
        @Test
        public void testTwoIntegerReturnsTrue() {
            assertEquals(true,validateUserInput.checkingifInputLengthIsTwo("44"));
        }
        @Test
        public void testOneIntegerReturnsFalse() {
            assertEquals(false,validateUserInput.checkingifInputLengthIsTwo("4"));
        }
        @Test
        public void testEmptyInputReturnsFalse() {
            assertEquals(false,validateUserInput.validateTheInput("")); }
}