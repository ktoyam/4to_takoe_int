package pract10;

public class ex10 {
    public static void main(String[] args) {
        int num = 86421;
        System.out.println(ReverseNum(num, 0, String.valueOf(num).length()));
    }
    public static int ReverseNum(int num, int res, int d){
        if(num==0) return res;
        else{
            return (ReverseNum(num/10, res+num%10*(int)(Math.pow(10,d-1)),d-1));
        }
    }
}
