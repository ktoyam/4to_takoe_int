package pract8.ex1;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x,y,radius*2,radius*2);
        this.setBounds(x,y,radius*2,radius*2);
    }
}
