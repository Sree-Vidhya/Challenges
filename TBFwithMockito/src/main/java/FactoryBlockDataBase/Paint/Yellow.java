package FactoryBlockDataBase.Paint;

import FactoryBlockDataBase.Color;

public class Yellow implements Color {
    String color = "Yellow";
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
