package FactoryBlockDataBase;

public class Block {
    Shape shape;
    Color color;

    public Block(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public Color getColor() {
        return color;
    }
    public int getTotalPrice()
    {
        return color.getPriceOftheColor() + shape.getPriceOftheShape();
    }
}
