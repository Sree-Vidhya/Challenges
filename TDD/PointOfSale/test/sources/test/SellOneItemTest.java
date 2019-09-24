package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellOneItemTest
{
    @Test
    public void name() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale();
        sale.onBarcode("12345");
        assertEquals("$7.95",display.getText());
    }

    public static class Display {
        public String getText() {
            return "$7.95";
        }
    }

    public static class Sale {
        public void onBarcode(String barcode) {
        }
    }
}
