package pract27.SnakeGame.Model;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private final ArrayList<Point> points;
    private Point currentPos;
    private final AreaListener areaListener;

    public Point getDirdiff() {
        return dirdiff;
    }

    private final Point dirdiff;

    public Snake(Point currentPos, AreaListener areaListener) {
        this.currentPos = currentPos;
        this.areaListener = areaListener;
        points = new ArrayList<>(30);
        dirdiff = new Point(1, 0);
    }

    public void tick() {
        removePoint(0);
        currentPos = new Point(currentPos.x + dirdiff.x, currentPos.y + dirdiff.y);
        addPoint(currentPos);
        removeCollision();
    }

    public void init(int length) {
        addPoint(currentPos);
        for (int i = 1; i < length; i++) {
            addPoint(0, new Point(currentPos.x - i, currentPos.y));
        }
    }

    public void adjustLength(int adjustValue) {
        var fp = points.get(0);
        var sp = points.get(1);
        Point diffp = sp.x-fp.x == 0 ? (sp.y-fp.y > 0 ? new Point(0, -1) : new Point(0, 1)) : (sp.x-fp.x > 0 ? new Point(-1, 0) : new Point(1, 0));
        for(int x = fp.x+diffp.x, y = fp.y+diffp.y, i =0;i<adjustValue;i++, x+=diffp.x, y+=diffp.y){
            addPoint(0, new Point(x,y));
        }
        removeCollision();
    }

    private void removeCollision() {
        for (int i = points.size() - 2; i >= 0; i--) {
            if (points.get(i).equals(currentPos)) {
                i-=2;
                for (; i >= 0; i--) {
                    removePoint(i);
                }
            }
        }
    }

    public int getLength(){
        return points.size();
    }

    public Point getCurrentPos() {
        return currentPos;
    }

    private void addPoint(Point p){
        points.add(p);
        areaListener.RectAdded(p);
    }

    private void addPoint(int index, Point p){
        points.add(index, p);
        areaListener.RectAdded(p);
    }

    private void removePoint(int index){
        areaListener.RectRemoved(points.get(index));
        points.remove(index);
    }
}
