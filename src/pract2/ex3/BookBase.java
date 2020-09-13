package pract2.ex3;

public class BookBase {
    public final int Pages;
    public final String Name;

    public BookBase(int pages, String name) {
        Pages = pages;
        Name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Pages=" + Pages +
                ", Name='" + Name + '\'' +
                '}';
    }
}
