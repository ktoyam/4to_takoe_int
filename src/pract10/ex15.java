package pract10;

public class ex15 {
    public static void main(String[] args) {
        ParseNumRECURSIVEreverse(324578960);
    }

    public static void ParseNumRECURSIVEreverse(int num) {
        if(num<10) {
            System.out.print(num);
            return;
        }
        System.out.print(num%10);
        System.out.print(' ');
        ParseNumRECURSIVEreverse(num/10);
    }
}
