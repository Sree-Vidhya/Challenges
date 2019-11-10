import CustomerDataBaseTest.CustomerkeyBoardInput;
import OrderDataBase.Order;
import OrderDataBase.OrderInformationFromKeyBoardInput;
import ReportingSystem.CuttingReport;
import ReportingSystem.InvoiceReport;
import ReportingSystem.PaintingReport;
import ReportingSystem.ReportSystem;

import java.util.ArrayList;

public class ToyBlockFactoryApplication {
    static String name;
    static String address;
    static String dueDate;
    static ArrayList blockCollection = new ArrayList();
    static Order generatingOrder = new Order(dueDate,blockCollection);


    public static void main(String[] args) {
        CustomerkeyBoardInput customer = new CustomerkeyBoardInput();
        OrderInformationFromKeyBoardInput order = new OrderInformationFromKeyBoardInput();
        name = customer.getNameFromTheUser();
        address = customer.getAddressFromTheUser();
        generatingOrder = order.generateAnOrderFromTheInformationProvided();
        ReportSystem cuttingReport = new CuttingReport();
        System.out.println(cuttingReport.displayOutputToTerminal(name, address,generatingOrder ));
        ReportSystem invoiceReport = new InvoiceReport();
        System.out.println(invoiceReport.displayOutputToTerminal(name,address,generatingOrder ));
        ReportSystem paintingReport = new PaintingReport();
        System.out.println(paintingReport.displayOutputToTerminal(name,address,generatingOrder));
    }
}
