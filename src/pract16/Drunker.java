package pract16;

import java.util.Scanner;

public class Drunker {
    public static void main(String[] args) {
        CustomList<Integer> first = new CustomList<>(10);
        CustomList<Integer> second = new CustomList<>(10);
        {
            Scanner sc = new Scanner(System.in);
            var f = sc.nextLine().split(" ");
            var s = sc.nextLine().split(" ");
            for (var c : f
            ) {
                first.add(Integer.parseInt(c));
            }
            for (var c : s
            ) {
                second.add(Integer.parseInt(c));
            }
        }
        int counter=0;
        String msg = "botva";
        while(counter<=106){
            var fcard = first.get(0);
            var scard = second.get(0);
            first.remove(0);
            second.remove(0);
            var winner = CheckCards(fcard, scard) ? first : second;
            winner.addArray(new Integer[] {fcard, scard});
            counter++;
            if(first.getCount()==0) {
                msg = "second " + counter;
                break;
            }
            else if (second.getCount()==0){
                msg = "first " + counter;
                break;
            }
        }
        System.out.println(msg);
    }
    //true - f>s false f<s
    private static boolean CheckCards(Integer f, Integer s){
        if(f==0 && s == 9) return true;
        else if(f==9 && s==0) return false;
        else return f>s;
    }
}
