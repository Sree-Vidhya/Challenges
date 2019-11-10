package FactoryBlockDataBaseTest;

import FactoryBlockDataBase.Cut.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {
    Triangle shape = new Triangle();

    @Test
    public void getShapeReturnsShape() {
        assertEquals("Triangle",shape.getShape());
    }

    @Test
    public void getPriceOftheShapeReturnsThePriceOfTheShape() {
        assertEquals(2,shape.getPriceOftheShape());
    }
}
