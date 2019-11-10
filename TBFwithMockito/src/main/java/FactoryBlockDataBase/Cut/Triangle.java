package FactoryBlockDataBase.Cut;

import FactoryBlockDataBase.Shape;

public class Triangle implements Shape {
    String shape = "Triangle";
    int priceOfShape = 2;


    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public int getPriceOftheShape() {
        return priceOfShape;
    }
}
