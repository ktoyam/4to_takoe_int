package pract10;

public class ex07 {
    public static void main(String[] args) {
        FactorizCout(1000);
    }

    public static void FactorizCout(int num){
        for(int i =2; i<=Math.sqrt(num); i++)
        {
            while(num%i==0)
            {
                System.out.println(i);
                num/=i;
            }
        }
        if(num!=1) System.out.println(num);
    }
}
