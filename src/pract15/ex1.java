package pract15;

import java.util.LinkedList;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("dadad");
        ll.add("qweqwe");
        ll.addLast("eto list");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("qweqwe");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
