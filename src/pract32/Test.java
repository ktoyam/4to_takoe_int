package pract32;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("drink.out"));
        oos.writeObject(new Drink(100,"Cola", "Black drink."));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("drink.out"));
        Drink dr = (Drink) ois.readObject();
        System.out.println(dr);
        ois.close();
    }
}
