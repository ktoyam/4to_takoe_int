package pract10;

public class ex05 {
    public static void main(String[] args) {
        System.out.println(SumOfDigitsRecurseMda(47,0));
    }
    private static int SumOfDigitsRecurseMda(int i, int res){
        if(i == 0) return res;
        return SumOfDigitsRecurseMda(i/10, res+=i%10);
    }
}
