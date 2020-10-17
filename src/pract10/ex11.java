package pract10;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int c=0;
        String inp;
        do{
           System.out.print("Next char: ");
            inp = sc.nextLine();
            if(Integer.parseInt(inp) == 1) c++;
        }
        while(!inp.equals("00"));
        System.out.println("Count: "+c);
    }
}
