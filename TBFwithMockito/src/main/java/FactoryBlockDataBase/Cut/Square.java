package FactoryBlockDataBase.Cut;

import FactoryBlockDataBase.Shape;

public class Square implements Shape {
    String shape = "Square";
    int priceOfShape = 1;


    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public int getPriceOftheShape() {
        return priceOfShape;
    }
}
