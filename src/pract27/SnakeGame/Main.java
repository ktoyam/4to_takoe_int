package pract27.SnakeGame;


import pract27.SnakeGame.View.GameView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameView().show());
    }
}
