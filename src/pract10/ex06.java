package pract10;

public class ex06 {
    public static void main(String[] args) {
        System.out.println(CheckPrimeNormal(273));
    }

    public static boolean CheckPrimeRECURSIVE(int num, int divider){
       if(divider>Math.sqrt(num)) return true;
       else if(num%divider == 0) return false;
       else return CheckPrimeRECURSIVE(num, divider+=2);
    }
    public static boolean CheckPrimeNormal(int num){
        if((num&1) != 1) return false;
        else return CheckPrimeRECURSIVE(num, 3);
    }
}
