package pract1;

import java.util.Arrays;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        int max = 1000;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*max);
        }
        Arrays.sort(arr);
        System.out.println("Math.random sorted:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "]: " + arr[i]);
        }

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        Arrays.sort(arr);
        System.out.println("Random sorted:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "]: " + arr[i]);
        }
    }
}
