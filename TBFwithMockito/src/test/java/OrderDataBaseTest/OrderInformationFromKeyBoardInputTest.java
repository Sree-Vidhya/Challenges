package OrderDataBaseTest;

import FactoryBlockDataBase.Block;
import FactoryBlockDataBase.Cut.Circle;
import FactoryBlockDataBase.Cut.Square;
import FactoryBlockDataBase.Cut.Triangle;
import FactoryBlockDataBase.Paint.Blue;
import FactoryBlockDataBase.Paint.Red;
import FactoryBlockDataBase.Paint.Yellow;
import OrderDataBase.Order;
import OrderDataBase.OrderRepository;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrderInformationFromKeyBoardInputTest {
    Block block;
    Order order;
    ArrayList blockCollection = new ArrayList();
    int interger;
    public int validateInput(String input){
        if(input == "") {
            interger = 0;
        }
        else {
            return interger;
        }
        return interger;
    }
    public ArrayList testInputForBlockCollection()
    {
        int redSquare = 1;
        blockCollection.add(redSquare);
        int blueSquare = 0;
        blockCollection.add(blueSquare);
        int yellowSquare = 1;
        blockCollection.add(yellowSquare);
        int redTriangle = 0;
        blockCollection.add(redTriangle );
        int blueTriangle = 2;
        blockCollection.add(blueTriangle );
        int yellowTriangle = 0;
        blockCollection.add(yellowTriangle );
        int redCircle = 0;
        blockCollection.add(redCircle );
        int blueCircle = 1;
        blockCollection.add(blueCircle );
        int yellowCircle = 2;
        blockCollection.add(yellowCircle );
        return blockCollection;

    }

    @Test
    public void creatingBlockCollectionFromUserInputReturnsBlockCollection() {
        blockCollection = testInputForBlockCollection();
        MockOrderInformationFromKeyBoardInput mock = new MockOrderInformationFromKeyBoardInput(order);
        assertEquals(blockCollection,mock.creatingBlockCollectionFromUserInput());
    }

    @Test
    public void creatingAnOrderReturnsAnOrder() {
        blockCollection = testInputForBlockCollection();
        order = new Order("5th Nov",blockCollection);
        MockOrderInformationFromKeyBoardInput mock = new MockOrderInformationFromKeyBoardInput(order);
        assertEquals(order.getDueDate(),mock.generateAnOrderFromTheInformationProvided().getDueDate());
        assertEquals(order.getOrderNumer(),mock.generateAnOrderFromTheInformationProvided().getOrderNumer());
        assertEquals(order.getBlockCollection(),mock.generateAnOrderFromTheInformationProvided().getBlockCollection());
    }
    @Test
    public void generateNextOrderNumberReturnsNextOrderNumber() {
        blockCollection = testInputForBlockCollection();
        order = new Order("5th Nov",blockCollection);
        assertEquals(1,order.getNextOrderNumer());
    }

    @Test
    public void getOrderWithOrderNumber() {
        blockCollection = testInputForBlockCollection();
        order = new Order("5th Nov",blockCollection);
        order.getNextOrderNumer();
        OrderRepository repo = new OrderRepository();
        repo.addOrdertoDatabase(order);
        MockOrderInformationFromKeyBoardInput mockOrder = new MockOrderInformationFromKeyBoardInput(order);
        Order getOrder =  mockOrder.getOrderWithOrderNumber(1);
        assertEquals(order,getOrder);
    }

}
