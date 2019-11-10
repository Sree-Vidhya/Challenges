package FactoryBlockDataBaseTest;

import FactoryBlockDataBase.Paint.Red;
import org.junit.Test;


import static org.junit.Assert.*;

public class RedTest {
    Red color = new Red();

    @Test
    public void getColorReturnsColor() {
        assertEquals("Red",color.getColor());
    }

    @Test
    public void getPriceOftheColorReturnsThePriceOfTheColor() {
        assertEquals(1,color.getPriceOftheColor());
    }
}
