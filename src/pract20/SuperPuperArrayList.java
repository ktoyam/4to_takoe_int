package pract20;

public class SuperPuperArrayList<E> {
    public E[] data;

    public SuperPuperArrayList(E[] data) {
        this.data = data;
    }

    public E getElementAt(int index){
        return data[index];
    }
}
