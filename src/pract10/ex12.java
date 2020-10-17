package pract10;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        CinAndParseNums();
    }
    public static void CinAndParseNums(){
        int n,c=0;
        var sc = new Scanner(System.in);
        do{
            n = sc.nextInt();
            if((n&1)==1) c++;
        }while(n!=0);
        System.out.println("Count: "+c);
    }
}
