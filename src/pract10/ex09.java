package pract10;

public class ex09 {
    public static void main(String[] args) {
        System.out.println(CountSeq(3,3));
    }

    public static int CountSeq(int zeros,int ones)
    {
        if(zeros == 0) return 1;
        else if(zeros == 1) return ones+1;
        else if(zeros>1 && ones ==0) return 0;
        else return (CountSeq(zeros-1, ones-1) + CountSeq(zeros,ones-1));
    }
}
