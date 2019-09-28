package test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SellOneItemTest
{
    @Test
    public void productFound() throws Exception
    {
        final Display display = new Display();
        final Sale sale = new Sale(display,new HashMap<String, String>() {{
            put("12345", "$7.95");
            put("23456", "$12.50");
        }});
        sale.onBarcode("12345");
        assertEquals("$7.95",display.getText());
    }

    @Test
    public void anotherProductFound() throws Exception
    {
        final Display display = new Display();
        final Sale sale = new Sale(display,new HashMap<String, String>() {{
            put("12345", "$7.95");
            put("23456", "$12.50");
        }});
        sale.onBarcode("23456");
        assertEquals("$12.50",display.getText());
    }
    @Test
    public void productNotFound() throws Exception
    {
        final Display display = new Display();
        final Sale sale = new Sale(display,new HashMap<String, String>() {{
            put("12345", "$7.95");
            put("23456", "$12.50");
        }});
        sale.onBarcode("99999");
        assertEquals("product Not Found for 99999", display.getText());
    }

    @Test
    public void emptyBarcode() throws Exception
    {
        final Display display = new Display();
        final Sale sale = new Sale(display,new HashMap<String, String>(){{}});
        sale.onBarcode("");
        assertEquals("scanning error:empty barcode",display.getText());
    }

    public static class Display
    {
        private String text;
        public String getText()
        {
            return text;
        }

        public void setText(String text)
        {
            this.text = text;
        }
    }
    public static class Sale
    {
        private Display display;
        private Map<String,String> pricesByBarCode;
        public Sale(Display display, Map<String, String> pricesByBarCode)
        {
            this.display = display;
            this.pricesByBarCode = pricesByBarCode;
        }
        public void onBarcode(String barcode)
        {
            if("".equals(barcode)) {
                //SMELL Refused bequest; move this up the call stack?
                display.setText("scanning error:empty barcode");
                return;
            }
            if (pricesByBarCode.containsKey(barcode))
                display.setText(pricesByBarCode.get(barcode));
            else
                display.setText("product Not Found for " + barcode);
        }
    }
}
