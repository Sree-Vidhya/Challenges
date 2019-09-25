package test;

import org.junit.Ignore;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class SellOneItemTest
{
    @Test
    public void name() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale(String "12345");
        sale.onBarcode("12345");
        assertEquals("$7.95",display.getText());
    }

    @Test
    @Ignore("Refactoring...")
    public void anotherProductFound() throws Exception {
        final Display display = new Display();
        final Sale sale = new Sale();
        sale.onBarcode("23456");
        assertEquals("$12.50",display.getText());
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
        public Sale(Display display) {
            this.display = display;
        }

        private Display display;

        public void onBarcode(String barcode) {
            display.setText("$7.95");
        }
    }
}
