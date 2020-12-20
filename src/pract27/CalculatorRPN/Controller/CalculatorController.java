package pract27.CalculatorRPN.Controller;

import pract27.CalculatorRPN.Model.Calculator;

import java.util.InputMismatchException;
import java.util.concurrent.atomic.AtomicReference;

public class CalculatorController {
    private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public void handleValue(String input){
        calculator.values.push(Long.parseLong(input));
        System.out.println("------V+ " + input + "------");
        System.out.println("v"+calculator.values);
        System.out.println("~~~~~~V+ " + input + "~~~~~~");
    }
    public boolean tryHandleOperator(String input, AtomicReference<Long> output) {
        if (calculator.operators.size() == calculator.values.size() - 1) {
            return false;
        }
        calculator.operators.push(input.charAt(0));
        var execv = executeLast();
        output.set(execv);
        handleValue(String.valueOf(execv));
        System.out.println("------OP " + input + "------");
        System.out.println("v"+calculator.values);
        System.out.println("o"+calculator.operators);
        System.out.println("~~~~~~OP " + input + "~~~~~~");
        return true;
    }
    private long executeLast(){
        if(calculator.operators.empty()) throw new UnsupportedOperationException();
        return switch (calculator.operators.pop()) {
            case '+' -> calculator.values.pop() + calculator.values.pop();
            case '-' -> -calculator.values.pop() + calculator.values.pop();
            case '*' -> calculator.values.pop() * calculator.values.pop();
            case '/' -> revdiv(calculator.values.pop(), calculator.values.pop());
            case '^' -> (long) Math.pow(calculator.values.pop(), calculator.values.pop());
            default -> throw new InputMismatchException();
        };
    }
    private long revdiv(long d2,long d1){
        return d1/d2;
    }


    public char[] getOperators(){
        return calculator.getOperators();
    }
}
