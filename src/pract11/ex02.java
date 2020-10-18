package pract11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex02 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
    private static void createAndShowGui() {
        MainPanel2 mainPanel2 = new MainPanel2();
        mainPanel2.InitComponents();
        JFrame frame = new JFrame("Guess number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel2);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}

class MainPanel2 extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,800);
    }

    public void InitComponents() {
        this.setLayout(new BorderLayout());
        Border blackline = BorderFactory.createLineBorder(Color.black);
        JLabel[] labels = new JLabel[]{new JLabel("North"), new JLabel("West"), new JLabel("East"), new JLabel("South"), new JLabel("Center")};

        for (var l:labels
             ) {
            l.setBorder(blackline);
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setPreferredSize(new Dimension(150,150));
            l.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    JOptionPane.showMessageDialog(l, "U have entered: " + l.getText());
                }
            });
            add(l, l.getText());
        }
    }
}
