package math.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class Addfractiontest {
    @Test
    public void zeroPlusZero() throws Exception
    {
        assertEquals(0,new Fraction(0).plus(new Fraction(0)).intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception
    {
        assertEquals(3,new Fraction(3).plus(new Fraction(0)).intValue());
    }

    @Test
    public void ZeroPlusNonZero() throws Exception
    {
        assertEquals(5,new Fraction(0).plus(new Fraction(5)).intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception
    {
        assertEquals(7,new Fraction(3).plus(new Fraction(4)).intValue());
    }
    @Test
    public void negativeInputsAndNegativeOutput() throws Exception
    {
        assertEquals(-2,new Fraction(-3).plus(new Fraction(1)).intValue());
    }
}
