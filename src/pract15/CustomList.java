package pract15;

public class CustomList<T> {
    private Object[] dataArray;
    private int count;

    public CustomList(int capacity) {
        if(capacity<1) throw new IllegalArgumentException("capacity");
        dataArray = new Object[capacity];
        count = 0;
    }

    public CustomList(){
        this(10);
    }

    public int getCount(){
        return count;
    }

    public int getCapacity(){
        return dataArray.length;
    }

    private Boolean checkIndex(int index){
        return index<count;
    }

    private void ensureCapacity(int newCapacity){
        if(newCapacity> dataArray.length){
            int tcapacity = dataArray.length;
            while(newCapacity>tcapacity) tcapacity*=2;
            Object[] tarray = new Object[tcapacity];
            for(int i = 0; i< count; i++) tarray[i] = dataArray[i];
            dataArray = tarray;
        }
    }

    public void add(T element){
        ensureCapacity(count+1);
        dataArray[count] = element;
        count++;
    }

    public void addBegin(T element){
        add(element, 0);
    }

    public void add(T element, int index) {
        ensureCapacity(count + 1);
        if (index == count) {
            dataArray[count] = element;
            count++;
            return;
        }
        for (int i = count; i > index; i--) {
            dataArray[i] = dataArray[i - 1];
        }
        dataArray[index] = element;
        count++;
    }

    public void addArray(T[] elements){
        ensureCapacity(count+elements.length);
        for(int i =0;i<elements.length;i++, count++){
            dataArray[count] = elements[i];
        }
    }

    public T get(int index){ //zero-based index
        if(!checkIndex(index)) throw new IndexOutOfBoundsException("index");
        return (T) dataArray[index];
    }

    public void remove(int index){
        if(!checkIndex(index)) throw new IndexOutOfBoundsException("index");
        count--;
        for(int i = index; i<count;i++){
            dataArray[i] = dataArray[i+1];
        }
    }

    @Override
    public String toString() {
        if(count == 0) return "[]";
        StringBuilder sb = new StringBuilder(count*4);
        sb.append('[');
        int i;
        for(i = 0;i<count-1;i++)
        {
            sb.append(dataArray[i]);
            sb.append(", ");
        }
        sb.append(dataArray[i]);
        sb.append(']');
        return sb.toString();
    }
}
