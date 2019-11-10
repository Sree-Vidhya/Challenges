package FactoryBlockDataBaseTest;

import FactoryBlockDataBase.Cut.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    Circle shape = new Circle();

    @Test
    public void getShapeReturnsShape() {
        assertEquals("Circle",shape.getShape());
    }

    @Test
    public void getPriceOftheShapeReturnsThePriceOfTheShape() {
        assertEquals(3,shape.getPriceOftheShape());
    }
}
