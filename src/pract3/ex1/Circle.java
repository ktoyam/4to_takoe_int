package pract3.ex1;

public class Circle {
    private int id;
    private double radius;

    public Circle(int id, double radius) {
        this.id = id;
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius*2;
    }

    public double getPerimeter(){
        return getDiameter()*Math.PI;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

}
