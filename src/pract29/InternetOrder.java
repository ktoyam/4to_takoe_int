package pract29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InternetOrder implements Order {
    private ItemNode head;
    private int count;

    public InternetOrder() {
        count = 0;
    }

    //item next prev
    public InternetOrder(List<Item> items) {
        head = new ItemNode(items.get(0));
        ItemNode currentNode = head;
        for(count = 1;count<items.size();count++){
            currentNode.next = new ItemNode(items.get(count), null, currentNode);
            currentNode = currentNode.next;
        }
    }

    @Override
    public void add(Item item) {
        ItemNode lastNode = head;
        while(lastNode.next != null) lastNode = lastNode.next;
        lastNode.next = new ItemNode(item, null, lastNode);
        count++;
    }

    @Override
    public boolean del(String name) {
        ItemNode currentNode = head;
        while(currentNode.next != null){
            if(currentNode.data.getName().contentEquals(name)){
                if(currentNode.prev != null){
                    currentNode.prev.next = currentNode.next;
                }
                if(currentNode.next != null){
                    currentNode.next.prev = currentNode.prev;
                }
                currentNode.next = null;
                currentNode.prev = null;
                currentNode.data = null;
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int delRange(String name) {
        int count = 0;
        while(del(name)) count++;
        return count;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int priceSum() {
        if(head == null) return 0;
        ItemNode currNode = head;
        int sum=head.data.getPrice();
        while(currNode.next != null){
            currNode=currNode.next;
            sum+=currNode.data.getPrice();
        }
        return sum;
    }

    @Override
    public int itemAmount(String name) {
        if(head == null) return 0;
        ItemNode currNode = head;
        int amount= head.data.getName().contentEquals(name) ? 1 : 0;
        while(currNode.next != null){
            currNode=currNode.next;
            if(currNode.data.getName().contentEquals(name)) amount++;
        }
        return amount;
    }

    @Override
    public List<String> uniqArray() {
        ArrayList<String> res = new ArrayList<>();
        if(head == null) return res;
        res.add(head.data.getName());
        ItemNode currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
            var nn = currNode.data.getName();
            if(!res.contains(nn)){
                res.add(nn);
            }
        }
        return res;
    }

    @Override
    public Item[] descSortedPrice() {
        Item[] res = new Item[count];
        ItemNode cur = head;
        for(int i =0;i<count;i++){
            res[i] = cur.data;
            cur = cur.next;
        }
        Arrays.sort(res, Comparator.comparingInt(Item::getPrice));
        return res;
    }
}
