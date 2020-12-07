package pract26;

public class AQTest {
    public static void main(String[] args){
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        aq.enqueue(4);
        aq.enqueue(5);
        aq.enqueue(6);
        aq.enqueue(7);
        aq.enqueue(8);
        aq.dequeue();
        aq.enqueue(9);
        System.out.println("SIZE: " + aq.size());
        var count = aq.size();
        for (int i = 0; i < count; i++) {
            System.out.println("[" + i + "] " + aq.dequeue());
        }

        System.out.println();

        LinkedQueue<Integer> aq2 = new LinkedQueue<>();
        aq2.enqueue(1);
        aq2.enqueue(2);
        aq2.enqueue(3);
        aq2.enqueue(4);
        aq2.enqueue(5);
        aq2.enqueue(6);
        aq2.enqueue(7);
        aq2.enqueue(8);
        aq2.dequeue();
        aq2.enqueue(9);
        System.out.println("SIZE: " + aq2.size());
        var count2 = aq2.size();
        for (int i = 0; i < count2; i++) {
            System.out.println("[" + i + "] " + aq2.dequeue());
        }
    }
}
