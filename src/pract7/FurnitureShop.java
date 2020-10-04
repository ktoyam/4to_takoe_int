package pract7;

import java.util.ArrayList;

public class FurnitureShop {
    public ArrayList<Furniture> getSalesSheet() {
        return SalesSheet;
    }

    private final ArrayList<Furniture> SalesSheet;
    private long profit;

    public long getProfit() {
        return profit;
    }

    public FurnitureShop() {
        SalesSheet = new ArrayList<Furniture>();
        profit = 0;
    }

    public void AddFurnitureForSale(Furniture f){
        SalesSheet.add(f);
    }

    public void SellFurniture(Furniture f){
        profit+=f.getPrice();
        SalesSheet.remove(f);
    }
}
