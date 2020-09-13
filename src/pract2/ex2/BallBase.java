package pract2.ex2;

import java.text.MessageFormat;

public class BallBase {
    public BallBase(Type ballType, double weight) {
        BallType = ballType;
        Weight = weight;
    }

    public enum Type{
        Football,
        Handball,
        Baseball,
        Basketball
    }
    public final Type BallType;
    public final double Weight;

    @Override
    public String toString() {
        return MessageFormat.format("BallType is {0}. Its weight is {1} kg.", BallType, Weight);
    }
}
