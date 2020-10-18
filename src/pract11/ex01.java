package pract11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ex01 {
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
        JFrame frame = new JFrame("Guess number");
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
        return new Dimension(200,100);
    }


    private Random _rand;
    private String _num;
    private int _tries;

    public MainPanel(){
        _rand = new Random();
        _num = String.valueOf( _rand.nextInt(20));
        System.out.println("Debug: "+ _num);
        _tries = 3;
    }

    public void InitComponents(){
        JButton btn = new JButton("TRY!");
        JTextArea txt = new JTextArea(1,6);
        JTextField counts = new JTextField("Tries: " + _tries);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt.getText().equals(_num)){
                    JOptionPane.showMessageDialog(null, "U guess it!");
                    System.exit(1);
                }
                else{
                    if(_tries>1){
                        _tries--;
                        counts.setText("Tries: "+ _tries );
                        repaint();

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "U have 0 tries, gl next time!");
                        System.exit(0);
                    }
                }
                repaint();
            }
        });

        this.add(btn);
        this.add(txt);
        this.add(counts);

    }

}
