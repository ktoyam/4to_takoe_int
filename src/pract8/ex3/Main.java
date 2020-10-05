package pract8.ex3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class Main {
    private static void createAndShowGui(Image[] img) {
        MainPanel mainPanel = new MainPanel(img);
        JFrame frame = new JFrame("Slidesho");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        mainPanel.SlideShow(2000);
    }
    public static void main(String[] args) {
        ArrayList<String> fPaths = new ArrayList<>();
        if(args.length<1) return;
        for (final File fileEntry : new File(args[0]).listFiles()) {
            if (fileEntry.isFile()) {
                fPaths.add(fileEntry.getAbsolutePath());
            }
        }
        Image[] img = new Image[fPaths.size()];
        for (int i = 0; i < fPaths.size(); i++) {
            img[i] = new ImageIcon(fPaths.get(i)).getImage();
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui(img);
            }
        });
    }
}

class MainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img[currentImgIndex], 0, 0, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000,800);
    }

    public void SlideShow(int delay) {
        Timer timer = new Timer( delay, e -> {
            if(currentImgIndex==img.length-1) currentImgIndex=0;
            else currentImgIndex++;
            this.repaint();
        } );
        timer.setRepeats( true );
        timer.start();
    }

    private Image[] img;
    private int currentImgIndex;

    MainPanel(Image[] img){
        this.img = img;
        currentImgIndex = 0;
    }
}