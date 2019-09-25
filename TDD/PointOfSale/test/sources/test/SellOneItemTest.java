package test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SellOneItemTest
{
    @Test
    public void productFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);
        sale.onBarcode("12345");
        assertEquals("$7.95",display.getText());
    }

    @Test
    public void anotherProductFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);
        sale.onBarcode("23456");
        assertEquals("$12.50",display.getText());
    }
    @Test
    public void productNotFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(display);
        sale.onBarcode("99999");
        assertEquals("product Not Found for 99999", display.getText());
    }

    @Test
    public void emptyBarcode() throws Exception{
        final Display display = new Display();
        final Sale sale = new Sale(display);
        sale.onBarcode("");
        assertEquals("scanning error:empty barcode",display.getText());
    }

    public static class Display {
        private String text;
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class Sale {
        private Display display;
        public Sale(Display display) {
            this.display = display;
        }

        public void onBarcode(String barcode) {
             if("".equals(barcode)) {
                 display.setText("scanning error:empty barcode");
             }
             else {
                 // Lookup table
                 final Map<String,String> priceByBarcode = new HashMap<String,String>() {{
                    put("12345","$7.95");
                    put("23456","$12.50");
                 }};
                 if ("12345".equals(barcode))
                     display.setText(priceByBarcode.get("12345"));
                 else if ("23456".equals(barcode))
                     display.setText(priceByBarcode.get("23456"));
                 else
                     display.setText("product Not Found for " + barcode);
             }
        }
    }
}
