package pract12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
    private static void createAndShowGui() {
        MainPanel mainPanel = new MainPanel();
        mainPanel.InitComponents();
        JFrame frame = new JFrame("Planets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}

class MainPanel extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800,800);
    }

    public void InitComponents() {
        this.setLayout(new GridLayout(4,2));
        this.add(new JLabel("Planet: "));
        JComboBox g = new JComboBox(Planet.values());
        JLabel jlM = new JLabel();
        JLabel jlR = new JLabel();
        JLabel jlG = new JLabel();
        g.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var p = ((Planet)g.getSelectedItem());
                jlM.setText(
                        String.valueOf(p.getMass())
                );
                jlR.setText(
                        String.valueOf(p.getRadius())
                );
                jlG.setText(
                        String.valueOf(p.getGravity())
                );

            }
        });
        this.add(g);
        this.add(new JLabel("Mass(kg): "));
        this.add(jlM);
        this.add(new JLabel("Radius(km): "));
        this.add(jlR);
        this.add(new JLabel("Gravity(m/s^2): "));
        this.add(jlG);
        g.setSelectedIndex(0);
    }
}
