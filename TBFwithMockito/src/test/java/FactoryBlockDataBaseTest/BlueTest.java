package FactoryBlockDataBaseTest;

import FactoryBlockDataBase.Paint.Blue;
import FactoryBlockDataBase.Paint.Red;
import org.junit.Test;


import static org.junit.Assert.*;

public class BlueTest {
    Blue color = new Blue();

    @Test
    public void getColorReturnsColor() {
        assertEquals("Blue",color.getColor());
    }

    @Test
    public void getPriceOftheColorReturnsThePriceOfTheColor() {
        assertEquals(0,color.getPriceOftheColor());
    }
}