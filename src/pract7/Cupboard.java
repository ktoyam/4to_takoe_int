package pract7;

public class Cupboard extends Furniture{


    private int shelfsCount;

    public Cupboard(double length, double width, double height, double weight, java.awt.Color color, long price) {
        super(length, width, height, weight, color, price);
        shelfsCount = 0;
    }

    public void AddShelf(){
        shelfsCount++;
    }

    public void RemoveShelf(){
        if(shelfsCount>0) shelfsCount--;
    }
}
