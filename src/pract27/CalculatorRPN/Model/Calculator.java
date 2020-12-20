package pract27.CalculatorRPN.Model;

import java.util.Stack;

public class Calculator {
    public final Stack<Long> values;
    public final Stack<Character> operators;

    public Calculator() {
        values = new Stack<Long>();
        operators = new Stack<>();
    }

    public char[] getOperators()
    {
        return new char[]{
                '^',
                '/',
                '*',
                '-',
                '+'
        };
    }
}
