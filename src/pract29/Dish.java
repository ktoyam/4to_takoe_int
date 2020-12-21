package pract29;

public final class Dish implements Item{
    private final int price;
    private final String name;
    private final String descr;
    public Dish(int price, String name, String description) {
        if(price<0) throw new IllegalArgumentException();
        this.price = price;
        this.name = name;
        this.descr = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescr() {
        return descr;
    }
}
