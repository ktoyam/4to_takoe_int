package pract9;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainPanel extends JPanel {
    private boolean _showFigs;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(_showFigs)
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

    public MainPanel(){
        _showFigs = false;
        var b = new JButton("Generate shapes");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _showFigs = !_showFigs;
                b.setText(_showFigs ? "Destruct shapes" : "Generate shapes");
                repaint();
            }
        });
        this.add(b);
    }
}
