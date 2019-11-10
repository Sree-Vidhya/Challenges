package FactoryBlockDataBaseTest;

import FactoryBlockDataBase.Block;
import FactoryBlockDataBase.Cut.Circle;
import FactoryBlockDataBase.Paint.Red;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockTest {
Block block = new Block(new Circle(),new Red());
    @Test
    public void getShapeReturnsShape() {
        assertEquals("Circle",block.getShape().getShape());
    }

    @Test
    public void getColorReturnsColor() {
        assertEquals("Red",block.getColor().getColor());
    }

    @Test
    public void getTotalPriceReturnsTheSumOfShapeandColorPrice()
    {
        assertEquals(4,block.getTotalPrice());
    }
}
