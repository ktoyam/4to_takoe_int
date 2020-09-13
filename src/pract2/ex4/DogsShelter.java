package pract2.ex4;


import java.util.ArrayList;

public class DogsShelter {
    private final ArrayList<Dog> dogs;
    DogsShelter(){
        dogs = new ArrayList<>();
    }
    public void AddDog(Dog... dogs){
        for (int i = 0; i < dogs.length; i++) {
            this.dogs.add(dogs[i]);
        }
    }

    public String GetAllDogs(){
        if(!dogs.isEmpty()) {
            String s = dogs.get(0).toString();
            for (int i = 1; i < dogs.size(); i++) {
                s += '\n' + dogs.get(i).toString();
            }
            return s;
        }
        else return "Shelter is empty!";
    }
}
