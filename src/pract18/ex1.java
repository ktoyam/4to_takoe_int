package pract18;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2 / i);
        }
        catch (Exception e){
            System.out.println("I caught exception! Message:  " + e.getMessage());
        }
        finally {
            System.out.println("Im in finally block. Code here executes ALWAYS after try catch block, even if exception thrown!");
        }
    }
}
