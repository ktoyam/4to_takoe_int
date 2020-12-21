package pract29;

import java.util.ArrayList;

public class TableOrdersManager {
    private ArrayList<Order> orders =new ArrayList<>();
    private ArrayList<MenuItem> menus = new ArrayList<>();

    public void add(Order order, int tableNumber){
        orders.add(tableNumber, order);
    }

    public void addItem(MenuItem item, int tableNumber){
        menus.add(tableNumber,item);
    }

    public int freeTableNumber(){
        int res = menus.get(menus.size()-1).getCost();
        menus.remove(menus.size()-1);
        return res;
    }

    public int freeTableNumbers(){
        return 222222;
    }

    public Order getOrder(int tableNumber){
        return orders.get(tableNumber);
    }

    public void remove(int tableNumber){
        orders.remove(tableNumber);
    }

    public int remove(Order order){
        return orders.remove(order) ? 1:0;
    }

    public int removeAll(Order order){
        int res =0;
        while(orders.remove(order))res++;
        return res;
    }
}
