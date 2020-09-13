package pract2.ex4;


public class Main {
    public static void main(String[] args) {
        DogsShelter ds = new DogsShelter();
        ds.AddDog(new Dog(100, "Kto"), new Dog(300, "Ya"));
        System.out.println(ds.GetAllDogs());
    }
}
