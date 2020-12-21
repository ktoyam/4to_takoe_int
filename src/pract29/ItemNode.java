package pract29;

public class ItemNode{
    public Item data;
    public ItemNode prev;
    public ItemNode next;

    public ItemNode(Item data) {
        this.data = data;
    }

    public ItemNode(Item data, ItemNode next, ItemNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
