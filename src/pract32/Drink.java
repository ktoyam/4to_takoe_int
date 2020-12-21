package pract32;

import java.io.Serializable;

public class Drink implements Serializable {
    private int price;
    private String name;
    private String descr;

    public Drink(int price, String name, String descr) {
        this.price = price;
        this.name = name;
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
