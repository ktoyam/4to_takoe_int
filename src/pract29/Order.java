package pract29;

import java.util.List;

public interface Order {
    void add(Item item);
    boolean del(String name);
    int delRange(String name);
    int size();
    int priceSum();
    int itemAmount(String name);
    List<String> uniqArray();
    Item[] descSortedPrice();
}
