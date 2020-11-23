package pract21.Chairs;

import java.util.concurrent.TimeUnit;

public class MultifuncChair implements  IChair {
    private final double width, length, height, enginePower;
    private double x,y;

    public MultifuncChair(double width, double length, double height, double enginePower, double x, double y) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.enginePower = enginePower;
        this.x = x;
        this.y = y;
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
        return height;
    }

    public boolean travelTo(double x, double y, double z){
        if(enginePower<=0) return false;
        var distance = Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2));
        try{
            TimeUnit.SECONDS.sleep((long) (distance/enginePower));
            return true;
        }
        catch (InterruptedException ex){
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
