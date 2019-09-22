package math.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class Addfractiontest {
    @Test
    public void zeroPlusZero() throws Exception
    {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0,sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception
    {
       final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3,sum.intValue());
    }

    @Test
    public void ZeroPlusNonZero() throws Exception
    {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5,sum.intValue());
    }
}
