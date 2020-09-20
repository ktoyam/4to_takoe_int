package pract3.ex3;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        b.setAuthor("kto-kto");
        b.setName("kto ya?");
        b.setYearOfCreation(666);
        System.out.println(b.toString());
    }
}
