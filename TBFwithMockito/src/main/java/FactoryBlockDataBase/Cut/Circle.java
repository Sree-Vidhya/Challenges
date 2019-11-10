package FactoryBlockDataBase.Cut;

import FactoryBlockDataBase.Shape;

public class Circle implements Shape {
    String shape = "Circle";
    int priceOfShape = 3;


    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public int getPriceOftheShape() {
        return priceOfShape;
    }
}
