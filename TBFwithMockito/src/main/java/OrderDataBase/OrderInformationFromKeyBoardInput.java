package OrderDataBase;

import FactoryBlockDataBase.Block;
import FactoryBlockDataBase.Cut.Circle;
import FactoryBlockDataBase.Cut.Square;
import FactoryBlockDataBase.Cut.Triangle;
import FactoryBlockDataBase.Paint.Blue;
import FactoryBlockDataBase.Paint.Red;
import FactoryBlockDataBase.Paint.Yellow;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderInformationFromKeyBoardInput implements OrderInformation {
    Scanner input = new Scanner(System.in);
    String dueDate;
    Block block;
    Order order;
    ArrayList blockCollection = new ArrayList();
    int orderNumber;
    Order getOrder;
    Order getOrderwithOrderNumber;
    int changingkeyboardInputToInteger;
    @Override
    public int generateNextOrderNumber() {
        return order.getOrderNumer();
    }
    public int validateKeyBoardInput(){
        String keyBoardInput = input.nextLine();
        if(keyBoardInput.matches("")) {
            int changingkeyboardInputToInteger = 0;
            return changingkeyboardInputToInteger;
        }
        else {
            try{
                int yourNumber = Integer.parseInt(keyBoardInput);
            }catch (NumberFormatException ex) {
                keyBoardInput = "0";
            }
            changingkeyboardInputToInteger = Integer.parseInt(keyBoardInput);
            return changingkeyboardInputToInteger;
        }
    }
    @Override
    public ArrayList creatingBlockCollectionFromUserInput() {
        block = new Block(new Square(), new Red());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int redSquare = validateKeyBoardInput();
        blockCollection.add(redSquare);
        block = new Block(new Square(), new Blue());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int blueSquare = validateKeyBoardInput();
        blockCollection.add(blueSquare);
        block = new Block(new Square(), new Yellow());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int yellowSquare = validateKeyBoardInput();
        blockCollection.add(yellowSquare);
        block = new Block(new Triangle(), new Red());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int redTriangle = validateKeyBoardInput();
        blockCollection.add(redTriangle );
        block = new Block(new Triangle(), new Blue());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int blueTriangle = validateKeyBoardInput();
        blockCollection.add(blueTriangle );
        block = new Block(new Triangle(), new Yellow());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int yellowTriangle = validateKeyBoardInput();
        blockCollection.add(yellowTriangle );
        block = new Block(new Circle(), new Red());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int redCircle = validateKeyBoardInput();
        blockCollection.add(redCircle );
        block = new Block(new Circle(), new Blue());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int blueCircle = validateKeyBoardInput();
        blockCollection.add(blueCircle );
        block = new Block(new Circle(), new Yellow());
        System.out.println("Please input the number of " +block.getColor().getColor()+" "+block.getShape().getShape());
        int yellowCircle = validateKeyBoardInput();
        blockCollection.add(yellowCircle );
        return blockCollection;
    }
    @Override
    public Order generateAnOrderFromTheInformationProvided() {
        System.out.println("Enter due date: ");
        dueDate = input.nextLine();
        blockCollection = creatingBlockCollectionFromUserInput();
        order = new Order(dueDate,blockCollection);
        return order;
    }

    public int getOrderNumberToSearchInTheRepository()
    {
        System.out.println("Enter code of the customer to get their details");
        orderNumber = input.nextInt();
        return orderNumber;
    }

    @Override
    public Order getOrderWithOrderNumber(int orderNumber) {
        getOrder =  OrderRepository.getOrderFromDataBase(orderNumber);
        return getOrder;
    }

    @Override
    public Order getOrderFromDatabase() {
        getOrderwithOrderNumber = getOrderWithOrderNumber(orderNumber);
        if(order != null) {
            System.out.println(order);
        } else {
            System.out.println("No such customer in database");
        }
        return order;
    }

    @Override
    public String toString() {
        return "OrderInformationFromKeyBoardInput{" +
                ", orderNumber=" + orderNumber +
                "dueDate='" + dueDate + '\'' +
                ", blockCollection=" + blockCollection +
                '}';
    }
}
