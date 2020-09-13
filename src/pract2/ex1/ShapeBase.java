package pract2.ex1;

import java.text.MessageFormat;

public class ShapeBase {
    public final String Description;
    public final int Sides;

    public ShapeBase(String description, int sides){
        Description = description;
        Sides = sides;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}. This shape has {1} sides.", Description, Sides);
    }
}
