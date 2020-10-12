package pract10;

public class ex04 {
    public static void main(String[] args) {
        System.out.println(SndasndqweNASDJ_oi(3, 3));
    }

    private static int SndasndqweNASDJ_oi(int k, int s) {
        int sumT, cT;
        int res = 0;
        for (int lower = (int) Math.pow(10, k - 1), upper = (int) Math.pow(10, k) - 1; lower <= upper; lower++) {
            for (sumT = 0, cT = lower; cT > 0; sumT += cT % 10, cT /= 10) ;
            if (sumT == s) {
                res++;
            }
        }
        return res;
    }
}
