package FactoryBlockDataBase.Paint;

import FactoryBlockDataBase.Color;

public class Red implements Color
{
    String color = "Red";
    int priceOfColor = 1;


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getPriceOftheColor() {
        return priceOfColor;
    }
}
