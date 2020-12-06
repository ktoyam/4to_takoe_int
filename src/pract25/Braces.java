package pract25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Braces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if(isValid(input)){
            System.out.println("Valid: " + input);
        }
        else{
            System.out.println("NOT Valid: " + input);
        }
    }

    public static boolean isValid(String inp){
        var pat = Pattern.compile("\\([\\d+/\\-*]*\\)");

        var m = pat.matcher(inp);
        while(m.find()){
            inp = m.replaceAll("1");
            m = pat.matcher(inp);
        }
        return (inp.indexOf('(')== -1 && inp.indexOf(')')==-1);
    }
}
