package pract2.ex1;

public class Square extends ShapeBase {
    public Square(int sideLength) {
        super("This is square like spanch<3bob pants", 4);
        SideLength = sideLength;
    }
    public int GetArea(){
        return SideLength*SideLength;
    }

    public final int SideLength;
}
