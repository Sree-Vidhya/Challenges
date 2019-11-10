package ReportingSystem;

import FactoryBlockDataBase.Block;
import FactoryBlockDataBase.Cut.Circle;
import FactoryBlockDataBase.Cut.Square;
import FactoryBlockDataBase.Cut.Triangle;
import FactoryBlockDataBase.Paint.Blue;
import FactoryBlockDataBase.Paint.Red;
import FactoryBlockDataBase.Paint.Yellow;
import OrderDataBase.Order;

import java.util.ArrayList;

import static java.lang.String.format;

public class PaintingReport implements ReportSystem {
    String dueDate;
    ArrayList blockCollection = new ArrayList();
    int orderNumber = 0;
    @Override
    public String displayOutputToTerminal(String name, String address, Order generatingOrder) {
        StringBuilder stringBuilderForPrintingInNewLine = new StringBuilder();
        StringBuilder stringBuilderForPrintingInSameLine = new StringBuilder();
        StringBuilder stringBuilderForFormattingString = new StringBuilder();
        orderNumber = generatingOrder.getOrderNumer();
        dueDate = generatingOrder.getDueDate();
        blockCollection = generatingOrder.getBlockCollection();
        stringBuilderForPrintingInNewLine.append("\n");
        stringBuilderForPrintingInNewLine.append("Your painting report has been generated:");
        stringBuilderForPrintingInNewLine.append("\n");
        stringBuilderForPrintingInNewLine.append("----------------------------------------");
        stringBuilderForPrintingInSameLine.append("Name: "+name +" "+ "Address: " + address+" "+ "Due Date: " + dueDate + " "+ "Order #: "+ format("%04d%n", orderNumber));
        final Object[][] table = new String[4][];
        String redSquare = String.valueOf( blockCollection.get(0));
        String blueSquare = String.valueOf(blockCollection.get(1));
        String yellowSquare = String.valueOf(blockCollection.get(2));
        String redTriangle = String.valueOf(blockCollection.get(3));
        String blueTriangle = String.valueOf(blockCollection.get(4));
        String yellowTriangle = String.valueOf(blockCollection.get(5));
        String redCircle = String.valueOf(blockCollection.get(6));
        String blueCircle = String.valueOf(blockCollection.get(7));
        String yellowCircle = String.valueOf(blockCollection.get(8));
        Block squareInRed = new Block(new Square(),new Red());
        Block triangleInBlue = new Block(new Triangle(),new Blue());
        Block circleInYellow = new Block(new Circle(),new Yellow());
        table[0] = new String[] { "  ",squareInRed.getColor().getColor() , triangleInBlue.getColor().getColor(), circleInYellow.getColor().getColor()};
        table[1] = new String[] { squareInRed.getShape().getShape(),redSquare,blueSquare,yellowSquare};
        table[2] = new String[] { triangleInBlue.getShape().getShape(), redTriangle ,blueTriangle,yellowTriangle };
        table[3] = new String[] { circleInYellow.getShape().getShape(), redCircle,blueCircle, yellowCircle };

        for (final Object[] row : table) {
            stringBuilderForFormattingString.append(format("%20s%20s%20s%20s\n", row));
        }
        return stringBuilderForPrintingInNewLine.toString() + "\n" + stringBuilderForPrintingInSameLine.toString() + "\n" + stringBuilderForFormattingString.toString() ;
    }
}
