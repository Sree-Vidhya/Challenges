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

public class CuttingReport implements ReportSystem {
    String dueDate;
    ArrayList blockCollection = new ArrayList();
    int orderNumber = 0;
    Block block;
    @Override
    public String displayOutputToTerminal(String name, String address, Order generatingOrder) {
        StringBuilder stringBuilderForPrintingInNewLine = new StringBuilder();
        StringBuilder stringBuilderForPrintingInSameLine = new StringBuilder();
        StringBuilder stringBuilderForFormattingString = new StringBuilder();
        CustomerkeyBoardInput customer = new CustomerkeyBoardInput();
        OrderInformationFromKeyBoardInput order = new OrderInformationFromKeyBoardInput();
        orderNumber = generatingOrder.getNextOrderNumer();
        dueDate = generatingOrder.getDueDate();
        blockCollection = generatingOrder.getBlockCollection();
        stringBuilderForPrintingInNewLine.append("\n");
        stringBuilderForPrintingInNewLine.append("Your cutting list has been generated:");
        stringBuilderForPrintingInNewLine.append("\n");
        stringBuilderForPrintingInNewLine.append("-------------------------------------");
        stringBuilderForPrintingInSameLine.append("Name: "+name +" "+ "Address: " + address+" "+ "Due Date: " + dueDate + " "+ "Order #: "+ format("%04d%n", orderNumber));
        stringBuilderForPrintingInNewLine.append("\n");
        int totalSquare = (int) blockCollection.get(0) + (int) blockCollection.get(1) + (int) blockCollection.get(2);
        int totalTriangle = (int) blockCollection.get(3) + (int) blockCollection.get(4) + (int) blockCollection.get(5);
        int totalCircle = (int) blockCollection.get(6) + (int) blockCollection.get(7) + (int) blockCollection.get(8);
        final Object[][] table = new String[4][];
        block = new Block(new Square(),new Red());
        table[0] = new String[] { "  ", "Qty" };
        table[1] = new String[] { block.getShape().getShape(), String.valueOf(totalSquare)};
        block = new Block(new Triangle(), new Blue());
        table[2] = new String[] { block.getShape().getShape(), String.valueOf(totalTriangle)};
        block = new Block(new Circle(),new Yellow());
        table[3] = new String[] { block.getShape().getShape(), String.valueOf(totalCircle)};

        for (final Object[] row : table) {
            stringBuilderForFormattingString.append(    format("%20s%20s\n", row));
        }
        stringBuilderForPrintingInNewLine.append("\n");
        return stringBuilderForPrintingInNewLine.toString() + "\n" + stringBuilderForPrintingInSameLine.toString() + "\n" + stringBuilderForFormattingString.toString() ;
    }
}
