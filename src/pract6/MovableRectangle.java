package pract6;

import pract5.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public double getArea() {
        return (bottomRight.x-topLeft.x)*(topLeft.y-bottomRight.y);
    }

    public double getPerimeter() {
        return (bottomRight.x-topLeft.x+topLeft.y-bottomRight.y)*2;
    }

    @Override
    public void moveUp() {
        if(!CheckSpeed()) return;
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        if(!CheckSpeed()) return;
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        if(!CheckSpeed()) return;
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        if(!CheckSpeed()) return;
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public boolean CheckSpeed(){
        return (topLeft.xSpeed == bottomRight.xSpeed &&
                topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
