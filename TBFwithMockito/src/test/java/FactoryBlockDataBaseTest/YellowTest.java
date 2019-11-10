package FactoryBlockDataBaseTest;
import FactoryBlockDataBase.Paint.Yellow;
import org.junit.Test;


import static org.junit.Assert.*;

public class YellowTest {
    Yellow color = new Yellow();
    @Test
    public void getColorReturnsColor() {
        assertEquals("Yellow",color.getColor());
    }

    @Test
    public void getPriceOftheColorReturnsThePriceOfTheColor() {
        assertEquals(0,color.getPriceOftheColor());
    }
}