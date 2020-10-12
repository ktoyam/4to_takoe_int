package pract10;

public class ex01 {
    public static void main(String[] args) {
        showTriangleSeq(14);
    }

    private static void showTriangleSeq(int n){
        int multi = String.valueOf(n).length();
        String curr;
        for(int i=1;i<=n;i++)
        {
            curr = String.valueOf(i);
            System.out.println((curr+" ".repeat(multi +1-curr.length())).repeat(i));
        }
    }
}
