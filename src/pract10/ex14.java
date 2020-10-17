package pract10;

public class ex14 {
    public static void main(String[] args) {
        ParseNumRECURSIVE(324578960);
    }

    public static void ParseNumRECURSIVE(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        }
        int t = (int) (Math.pow(10, Math.floor(Math.log10(num))));
        int o = num / t;
        System.out.print(o);
        System.out.print(' ');
        num -= (t * o);
        ParseNumRECURSIVE(num);
    }
}
