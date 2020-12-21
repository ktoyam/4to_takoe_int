package pract29;

public class MenuItem {
    private int cost;
    private String name;
    private String descr;

    public MenuItem(int cost, String name, String descr) {
        this.cost = cost;
        this.name = name;
        this.descr = descr;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }
}
