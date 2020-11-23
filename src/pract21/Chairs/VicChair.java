package pract21.Chairs;

public class VicChair implements IChair {
    private final double width, length;

    public VicChair(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getHeight() {
        return 150;
    }
}
