package pract27.SnakeGame.View;


import pract27.SnakeGame.Controller.GameController;
import pract27.SnakeGame.Model.AreaListener;
import pract27.SnakeGame.Model.Direction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameView {
    private final JFrame frame;
    private JPanel mainPanel;
    private JLabel scoreLabel;
    private GameController gameContr;
    private final int side = 20;

    private JPanel createMainPanel(){
        var jp = new JPanel();
        jp.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, gameContr.borders*side));
        jp.add(scoreLabel);
        return jp;
    }

    protected JFrame getFrame(){
        return frame;
    }

    public GameView(){
        frame = new JFrame("Snake Game");
        scoreLabel = new JLabel();
        gameContr = new GameController(new AreaListener() {
            @Override
            public void RectRemoved(Point rect) {
                mainPanel.getGraphics().clearRect(rect.x*side,rect.y*side,side,side );
            }

            @Override
            public void RectAdded(Point rect) {
                mainPanel.getGraphics().fillRect(rect.x*side,rect.y*side,side,side);
            }
        }, scoreLabel);

        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP,0,true), "TurnU");
        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0,true), "Exit");
        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN,0,true), "TurnD");
        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,0,true), "TurnR");
        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,0,true), "TurnL");
        frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,0,true), "Restart");

        frame.getRootPane().getActionMap().put("TurnU", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameContr.changeDir(Direction.Up);
            }
        });
        frame.getRootPane().getActionMap().put("TurnD", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameContr.changeDir(Direction.Down);
            }
        });
        frame.getRootPane().getActionMap().put("TurnR", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameContr.changeDir(Direction.Right);
            }
        });
        frame.getRootPane().getActionMap().put("TurnL", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameContr.changeDir(Direction.Left);
            }
        });
        frame.getRootPane().getActionMap().put("Exit", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.getRootPane().getActionMap().put("Restart", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameContr.start();
            }
        });
        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen()-x, e.getYOnScreen()-y);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                x = e.getX();
                y=e.getY();
            }
        });
    }
private int x,y;
    public void show(){
        mainPanel = createMainPanel();
        frame.setPreferredSize(new Dimension(gameContr.width*side, gameContr.height*side));
        frame.setContentPane(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        gameContr.init();
    }
}
