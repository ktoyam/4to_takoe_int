package pract27.CalculatorRPN;

import pract27.CalculatorRPN.View.CalculatorView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorView().show());
    }
}
