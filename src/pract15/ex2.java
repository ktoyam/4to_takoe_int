package pract15;

import java.util.ArrayList;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("dadad");
        al.add("qweqwe");
        al.add(2, "E");

        System.out.println(al);

        al.remove("qweqwe");
        al.remove(1);

        System.out.println(al);
    }
}
