package pract8.ex1;

import java.awt.*;

public class Rect extends Shape{
    private int width, height;

    public Rect(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(x,y, width, height);
    }
}
