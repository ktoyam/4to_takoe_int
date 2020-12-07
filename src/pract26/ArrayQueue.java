package pract26;

import java.util.Arrays;

public class ArrayQueue<E> implements ArrayQueueADT<E> {

    private Object[] array;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue(){
        array = new Object[4];
        head = 0;
        tail = 0;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        if(size == array.length){
            Object[] nr = new Object[array.length*2];

            if (head < tail) {
                System.arraycopy(array,head,nr,0,size);
            } else {
                System.arraycopy(array, head,nr,0,array.length-head);
                System.arraycopy(array,0,nr,array.length-head,tail);
            }
            head = 0;
            tail = size;
            array = nr;
        }
        array[tail] = element;
        tail = (tail+1)%array.length;
        size++;
    }

    @Override
    public E element() {
        return (E)array[0];
    }

    @Override
    public E dequeue() {
        Object removed = array[head];
        array[head] = null;
        head = (head+1)%array.length;
        size--;
        return (E)removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
        Arrays.fill(array, null);
        size=0;
        head=0;
        tail=0;
    }
}
