package pract10;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        CinAndParse();
    }

    public static void CinAndParse(){
        int n;
        boolean o = true;
        var sc = new Scanner(System.in);
        while((n = sc.nextInt())!=0){
            if(o)
            {
                System.out.println("OUT: "+n);
                o=false;
            }
            else{
                o = true;
            }
        }
    }
}
