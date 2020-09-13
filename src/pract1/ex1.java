package pract1;

public class ex1 {

    public static void main(String[] args) {
        int i, sum;
        int[] arr = new int[1000];
        for(i =0; i<arr.length; i++) arr[i] = i;

        sum=0;
        for(i=0; i<arr.length; i++) sum+=arr[i];
        System.out.println("For sum: " + sum);

        sum=0;
        i=0;
        while(i<arr.length) sum+=arr[i++];
        System.out.println("While sum: " + sum);

        sum=0;
        i=0;
        do {
            sum+=arr[i++];
        }
        while(i<arr.length);
        System.out.println("Do-While sum: " + sum);
    }
}
