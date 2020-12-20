package pract27.SnakeGame.Model;

import java.awt.*;

public class Fruit {
    private final Point position;
    private final int strength;

    public Fruit(Point position, int strength) {
        this.position = position;
        this.strength = strength;
    }

    public Point getPosition() {
        return position;
    }

    public int getStrength() {
        return strength;
    }
}
