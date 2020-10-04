package pract7;

import java.awt.*;

public abstract class Furniture {
    private double Length;
    private double Width;
    private double Height;
    private double Weight;
    private Color Color;
    private long Price;

    public double getLength() {
        return Length;
    }

    public Furniture(double length, double width, double height, double weight, java.awt.Color color, long price) {
        Length = length;
        Width = width;
        Height = height;
        Weight = weight;
        Color = color;
        Price = price;
    }

    public double getWidth() {
        return Width;
    }

    public double getHeight() {
        return Height;
    }

    public double getWeight() {
        return Weight;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public long getPrice() {
        return Price;
    }

    public void ChangeColor(Color color){
        Color = color;
    }

    public void ChangePrice(long price){
        Price = price;
    }
}
