package pract10;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        System.out.println("Res: " + ParseNumRECURSIVE3());
    }

    public static int ParseNumRECURSIVE3() {
        int count=0, max = 0, current;
        var sc = new Scanner(System.in);

        while((current = sc.nextInt())!=0){
            if(current>max) {max = current;count=1;}
            else if(current==max) count++;
        }
        return count;
    }
}
