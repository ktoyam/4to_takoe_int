package pract19;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var inp = sc.nextLine();
        if (inp.length() != 12) {
            System.out.println("ИНН состоит из 12 цифр");
            return;
        }
        for (var c :
                inp.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Только цифры!");
                return;
            }
        }
        System.out.println("ИНН введён верно!");
    }
}
