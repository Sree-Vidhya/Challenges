package FactoryBlockDataBaseTest;

import FactoryBlockDataBase.Cut.Square;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    Square shape = new Square();

    @Test
    public void getShapeReturnsShape() {
        assertEquals("Square",shape.getShape());
    }

    @Test
    public void getPriceOftheShapeReturnsThePriceOfTheShape() {
        assertEquals(1,shape.getPriceOftheShape());
    }
}
