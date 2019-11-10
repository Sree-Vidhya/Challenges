package FactoryBlockDataBase.Paint;

import FactoryBlockDataBase.Color;

public class Blue implements Color {
    String color = "Blue";
    int priceOfColor = 0;


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getPriceOftheColor() {
        return priceOfColor;
    }
}
