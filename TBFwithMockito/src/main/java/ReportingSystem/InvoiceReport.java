package ReportingSystem;

import CustomerDataBaseTest.CustomerkeyBoardInput;
import FactoryBlockDataBase.Block;
import FactoryBlockDataBase.Cut.Circle;
import FactoryBlockDataBase.Cut.Square;
import FactoryBlockDataBase.Cut.Triangle;
import FactoryBlockDataBase.Paint.Blue;
import FactoryBlockDataBase.Paint.Red;
import FactoryBlockDataBase.Paint.Yellow;
import OrderDataBase.Order;
import OrderDataBase.OrderInformationFromKeyBoardInput;

import java.util.ArrayList;

import static java.lang.String.format;

public class InvoiceReport implements ReportSystem {
    String dueDate;
    ArrayList blockCollection = new ArrayList();
    int orderNumber = 0;
    @Override
    public String displayOutputToTerminal(String name, String address, Order generatingOrder) {
        StringBuilder stringBuilderForPrintingInNewLine = new StringBuilder();
        StringBuilder stringBuilderForPrintingInSameLine = new StringBuilder();
        StringBuilder stringBuilderForFormattingString = new StringBuilder();
        StringBuilder stringBuilderForPrintingInNewLineForPrices = new StringBuilder();
        CustomerkeyBoardInput customer = new CustomerkeyBoardInput();
        OrderInformationFromKeyBoardInput order = new OrderInformationFromKeyBoardInput();
        orderNumber = generatingOrder.getOrderNumer();
        dueDate = generatingOrder.getDueDate();
        blockCollection = generatingOrder.getBlockCollection();
        stringBuilderForPrintingInNewLine.append("\n");
        stringBuilderForPrintingInNewLine.append("Your invoice report has been generated:");
        stringBuilderForPrintingInNewLine.append("\n");
        stringBuilderForPrintingInNewLine.append("---------------------------------------");
        stringBuilderForPrintingInSameLine.append("Name: "+name +" "+ "Address: " + address+" "+ "Due Date: " + dueDate + " "+ "Order #: "+String.format("%04d%n", orderNumber));
        stringBuilderForPrintingInNewLine.append("\n");
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
        int redTotal = (Integer.parseInt(redSquare)+Integer.parseInt(redTriangle)+Integer.parseInt(redCircle));

        table[0] = new String[] { "  ",squareInRed.getColor().getColor() , triangleInBlue.getColor().getColor(), circleInYellow.getColor().getColor()};
        table[1] = new String[] { squareInRed.getShape().getShape(),redSquare,blueSquare,yellowSquare};
        table[2] = new String[] { triangleInBlue.getShape().getShape(), redTriangle ,blueTriangle,yellowTriangle };
        table[3] = new String[] { circleInYellow.getShape().getShape(), redCircle,blueCircle, yellowCircle };

        for (final Object[] row : table) {
            stringBuilderForFormattingString.append(format("%20s%20s%20s%20s\n", row));
        }

        int totalSquare = (int) blockCollection.get(0) + (int) blockCollection.get(1) + (int) blockCollection.get(2);
        int totalTriangle = (int) blockCollection.get(3) + (int) blockCollection.get(4) + (int) blockCollection.get(5);
        int totalCircle = (int) blockCollection.get(6) + (int) blockCollection.get(7) + (int) blockCollection.get(8);
        Block squareBlock = new Block(new Square(),new Red());
        Block triangleBlock = new Block(new Square(),new Red());
        Block circleBlock = new Block(new Square(),new Red());

        stringBuilderForPrintingInNewLineForPrices.append(squareInRed.getShape().getShape() +"\t\t\t\t"+totalSquare+" @ "+"$"+squareBlock.getShape().getPriceOftheShape()+" ppi = $"+(totalSquare*squareBlock.getShape().getPriceOftheShape()));
        stringBuilderForPrintingInNewLineForPrices.append("\n");
        stringBuilderForPrintingInNewLineForPrices.append(triangleInBlue.getShape().getShape()+"\t\t\t"+totalTriangle+" @ "+"$"+triangleBlock.getShape().getPriceOftheShape()+" ppi = $"+(totalTriangle*triangleBlock.getShape().getPriceOftheShape()));
        stringBuilderForPrintingInNewLineForPrices.append("\n");
        stringBuilderForPrintingInNewLineForPrices.append(circleInYellow.getShape().getShape()+"\t\t\t\t"+totalCircle+" @ "+"$"+circleBlock.getShape().getPriceOftheShape()+" ppi = $"+(totalCircle*circleBlock.getShape().getPriceOftheShape()));
        stringBuilderForPrintingInNewLineForPrices.append("\n");
        stringBuilderForPrintingInNewLineForPrices.append(squareBlock.getColor().getColor()+" color surcharge"+"\t"+(redTotal)+" @ "+squareBlock.getColor().getPriceOftheColor()+" ppi = $"+redTotal*squareBlock.getColor().getPriceOftheColor());
        stringBuilderForPrintingInNewLineForPrices.append("\n");
        return stringBuilderForPrintingInNewLine.toString() + "\n" + stringBuilderForPrintingInSameLine.toString() + "\n" + stringBuilderForFormattingString.toString() + "\n"+ stringBuilderForPrintingInNewLineForPrices.toString();
    }
}
