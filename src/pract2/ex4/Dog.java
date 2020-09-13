package pract2.ex4;

public class Dog {
    private int Age;
    private String Name;
    public Dog(int age, String name){
        Age = age;
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public int getHumanBasedAge(){
        return Age*7;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Age=" + Age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
