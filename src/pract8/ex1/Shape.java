package pract8.ex1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    protected Color color;
    protected int x,y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
