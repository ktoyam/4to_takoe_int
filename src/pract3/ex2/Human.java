package pract3.ex2;


import java.awt.*;

public class Human {
    public Human(){
        Head = new Head(0.5);
        Legs = new Legs(new Point(0,0));
        Hands = new Hands();
    }
    public Head Head;
    public Legs Legs;
    public Hands Hands;

    public class Head {
        private Head(double mood){
            this.mood = mood;
        }
        private double mood;

        public boolean isItGood(String thing) {
            return Math.random() >= 0.5;
        }

        public double getMood() {
            return mood;
        }

        public void setMood(double mood) {
            this.mood = mood;
        }
    }

    public class Legs {
        private Legs(Point loc){
            currentLoc = loc;
        }

        private Point currentLoc;

        public void moveTo(Point point) {
            currentLoc = point;
        }

        public Point getCurrentLoc() {
            return currentLoc;
        }
    }

    public class Hands {
        private Hands(){
            isFree = true;
            grabbed = null;
        }
        private boolean isFree;
        private String grabbed;

        public boolean isFree() {
            return isFree;
        }

        public void setFree(boolean free) {
            isFree = free;
            if(isFree) grabbed = null;
        }

        public boolean TryToGrab(String thing){
            if(!isFree()) return false;
            else{
                grabbed = thing;
                return true;
            }
        }

        public String getGrabbed() {
            return grabbed;
        }
    }
}
