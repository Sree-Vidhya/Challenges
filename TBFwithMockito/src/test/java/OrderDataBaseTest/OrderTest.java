package OrderDataBaseTest;

import FactoryBlockDataBase.Block;
import FactoryBlockDataBase.Cut.Circle;
import FactoryBlockDataBase.Cut.Square;
import FactoryBlockDataBase.Paint.Blue;
import FactoryBlockDataBase.Paint.Red;
import OrderDataBase.Order;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrderTest {
    String dueDate = "5th Nov";
    Block block;
    ArrayList blockCollection = new ArrayList();
    Order order = new Order(dueDate,blockCollection);
    @Test
    public void getNextOrderNumerReturnsNextOrderNumber() {
        assertEquals(1,order.getNextOrderNumer());
    }

    @Test
    public void getDueDateReturnsDueDate() {
        assertEquals("5th Nov",order.getDueDate());
    }

    @Test
    public void getBlockCollectionReturnsBlockCollection() {
        block = new Block(new Circle(),new Red());
        blockCollection.add(block);
        block = new Block(new Square(),new Blue());
        blockCollection.add(block);
        assertEquals(blockCollection,order.getBlockCollection());
    }
    @Test
    public void generateOrderNumberReturnsOrderNumber() {
        assertEquals(0,order.getOrderNumer());
    }
}
