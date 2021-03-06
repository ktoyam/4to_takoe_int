package pract15;

public class CustomListTests {
    public static void main(String[] args) {
        CustomList<String> t = new CustomList<String>(2);
        t.add("first");
        t.add("second");
        t.addArray(new String[] {"third", "fourth"});
        t.addBegin("fifth");
        t.add("ended");
        t.remove(3);
        t.removeLast();
        System.out.println(t.get(1));
        System.out.println("Count: " + t.getCount());
        System.out.println("Capacity: " + t.getCapacity());
        System.out.println(t.toString());
    }
}
