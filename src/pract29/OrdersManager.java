package pract29;

public interface OrdersManager {
    Order[] getOrders();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    int ordersQuantity();
    int ordersCostSummary();
}
