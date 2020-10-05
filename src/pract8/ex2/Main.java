package pract8.ex2;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static void createAndShowGui(Image img) {
        MainPanel mainPanel = new MainPanel(img);
        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui(new ImageIcon(args[0]).getImage());
            }
        });
    }
}

class MainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000,800);
    }

    private Image img;

    MainPanel(Image img){
        this.img = img;
    }
}
