package pract27.SnakeGame.Controller;

import pract27.SnakeGame.Model.AreaListener;
import pract27.SnakeGame.Model.Direction;
import pract27.SnakeGame.Model.Fruit;
import pract27.SnakeGame.Model.Snake;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

public class GameController {
    private final Snake snake;
    private double speed;
    private Timer timer;
    private final ArrayList<Fruit> fruits;
    private final Random rand;
    public final int width = 20;
    public final int height = 20;
    public final int borders = 2;
    private final int maxFruits = 3;
    private final int speedMulti = 250;
    private final int defaultSnakeLength = 4;
    private final Point startPoint = new Point(5,5);
    private final int maxFruitStr = 4;
    private Direction direction;
    private final AreaListener areaListener;
    private final JLabel score;

    public GameController(AreaListener areaListener, JLabel score) {
        snake = new Snake(startPoint, areaListener);
        this.score = score;
        speed = 1.0;
        fruits = new ArrayList<>(maxFruits);
        rand = new Random(42);
        this.areaListener = areaListener;
    }

    public void start(){

        if(timer != null){
            timer.cancel();
            timer.purge();
        }
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                snake.tick();
                var pos = snake.getCurrentPos();
                if(pos.x==width-borders || pos.x==borders-1 || pos.y==height-borders || pos.y==borders-1){
                    timer.cancel();
                    timer.purge();
                    JOptionPane.showMessageDialog(null, "U lost!");
                }
                if(rand.nextDouble()>0.8d){
                    createRandomFruit();
                }
                Fruit f;
                for (int i = 0; i < fruits.size(); i++) {
                    f = fruits.get(i);
                    if(f.getPosition().equals(snake.getCurrentPos())){
                        fruits.remove(i);
                        snake.adjustLength(f.getStrength());
                    }
                }
                score.setText(String.valueOf(snake.getLength()));
                //System.out.println("SNAKE POS:" + snake.getCurrentPos());
            }
        }, 0, (long) (speedMulti*speed));
    }

    public void changeDir(Direction dir){
        if(dir.equals( direction)) return;
        Point newdiff = null;
        switch (dir){
                case Left -> newdiff = new Point(-1,0);
                case Up -> newdiff = new Point(0,-1);
                case Right -> newdiff = new Point(1,0);
                case Down -> newdiff = new Point(0,1);
        }
        if(newdiff.x+snake.getDirdiff().x == 0 && newdiff.y+snake.getDirdiff().y==0){
            return;
        }
        snake.getDirdiff().setLocation(newdiff);
        direction = dir;
    }

    private void createRandomFruit() {
        if (fruits.size() < maxFruits) {
            var nf =new Fruit(new Point(rand.nextInt(width), rand.nextInt(height)), rand.nextInt(maxFruitStr)+1);
            if(!nf.getPosition().equals(snake.getCurrentPos()) &&
                    !(nf.getPosition().x>=width-borders || nf.getPosition().x<=borders
                    || nf.getPosition().y>=width-borders || nf.getPosition().y<=borders)) {
                fruits.add(nf);
                areaListener.RectAdded(nf.getPosition());
            }
            System.out.println(nf.getPosition());
        }
    }

    public void init(){
        snake.init(defaultSnakeLength);
    }
}
