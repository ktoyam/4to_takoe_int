package pract1;

public class ex5 {
    public static void main(String[] args) {
        System.out.println(Fac(10));
    }
    public static int Fac(int x){
        return (x==1) ? 1: x*Fac(x-1);
    }
}
