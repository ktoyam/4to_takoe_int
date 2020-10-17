package pract10;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        System.out.println("Res: " + ParseNumRECURSIVE33dasda());
    }

    public static int ParseNumRECURSIVE33dasda() {
        int max = 0, current;
        var sc = new Scanner(System.in);
        while((current = sc.nextInt())!=0){
            if(current>max) max = current;
        }
        return max;
    }
}
