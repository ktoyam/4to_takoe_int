package pract26;

import java.util.LinkedList;

public class LinkedQueue<E> implements ArrayQueueADT<E> {
    private final LinkedList<E> list;

    public LinkedQueue() {
        list = new LinkedList<>();
    }


    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E element() {
        return list.getFirst();
    }

    @Override
    public E dequeue() {
        var removed = list.getFirst();
        list.removeFirst();
        return removed;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
