package pract8.ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ShowRandomShapes(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000,800);
    }

    public void ShowRandomShapes(Graphics g){
        Random rand = new Random();
        for(int i = 0;i<20;i++) {
            Shape c;
            if(i%2==0) {
                c = new Circle(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),
                        rand.nextInt(getPreferredSize().width), rand.nextInt(getPreferredSize().height),
                        rand.nextInt(100));
            }
            else{
                c = new Rect(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)),
                        rand.nextInt(getPreferredSize().width), rand.nextInt(getPreferredSize().height),
                        rand.nextInt(100), rand.nextInt(100));
            }
            c.paintComponent(g);
        }
    }
}
