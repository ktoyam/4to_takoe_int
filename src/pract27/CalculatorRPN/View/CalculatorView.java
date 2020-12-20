package pract27.CalculatorRPN.View;

import pract27.CalculatorRPN.Controller.CalculatorController;
import pract27.CalculatorRPN.Model.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

public class CalculatorView {
    private final JFrame frame;
    private JPanel mainPanel;
    private final CalculatorController calcContr;
    private JLabel displayLabel;
    private boolean isExecutedLast;

    private JPanel createMainPanel(){
        final int cols = 4;
        final int rows = 5;
        JPanel jp = new JPanel();
        jp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        var ops  = calcContr.getOperators();
        var opi = 0;
        c.gridy=rows-1;
        c.gridx=0;
        jp.add(createEnterButton(), c);
        c.gridx++;
        JButton btn = new JButton("0");
        connectNumButton(btn);
        jp.add(btn, c);
        c.gridx++;
        for(;c.gridx<cols;c.gridx++){
            btn = new JButton(String.valueOf(ops[opi++]));
            connectOperatorButton(btn);
            jp.add(btn, c);

        }
        c.gridy--;
        int num=1;
        for(; c.gridy>0;c.gridy--){
            for(c.gridx=0;c.gridx<cols-1;c.gridx++){
                btn = new JButton(String.valueOf(num++));
                connectNumButton(btn);
                jp.add(btn, c);
            }
            if(opi<ops.length){
                btn = new JButton(String.valueOf(ops[opi++]));
                connectOperatorButton(btn);
                jp.add(btn,c);
            }
        }
        c.gridx=0;
        c.gridwidth = 4;
        displayLabel = createDisplayLabel();
        jp.add(displayLabel,c);
        return jp;
    }

    private void connectNumButton(JButton btn){
        btn.addActionListener(e -> {
            if(isExecutedLast){
                displayLabel.setText(((JButton) e.getSource()).getText());
                isExecutedLast = false;
            }
            else{
                displayLabel.setText(displayLabel.getText() + ((JButton)e.getSource()).getText());
            }
        });
    }

    private JButton createEnterButton(){
        JButton res = new JButton("->");
        res.addActionListener(e-> {
            if(!isExecutedLast)
            calcContr.handleValue(displayLabel.getText());
            displayLabel.setText("");
        });
        return res;
    }
    private JLabel createDisplayLabel(){
        var res = new JLabel();
        res.setPreferredSize(new Dimension(0,40));
        res.setBorder(BorderFactory.createTitledBorder("Display"));
        return res;
    }
    private void connectOperatorButton(JButton btn){
        btn.addActionListener(e ->
        {
            if(!displayLabel.getText().isEmpty() && !isExecutedLast) calcContr.handleValue(displayLabel.getText());
            AtomicReference<Long> displayNum = new AtomicReference<>();
            var res = calcContr.tryHandleOperator(((JButton) e.getSource()).getText(), displayNum);
            if(res){
                displayLabel.setText(displayNum.toString());
                isExecutedLast = true;
            }
            else{
                JOptionPane.showMessageDialog(frame, "Bad input!");
            }
        });
    }

    protected JFrame getFrame(){
        return frame;
    }

    public CalculatorView(){
        frame = new JFrame("RPN Calc");
        calcContr = new CalculatorController(new Calculator());
        isExecutedLast = false;
    }

    public void show(){
        mainPanel = createMainPanel();
        frame.setPreferredSize(new Dimension(400,400));
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
