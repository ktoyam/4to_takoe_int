package pract3.ex2;

import java.awt.*;

public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.Hands.TryToGrab("pen");
        System.out.println("Grabbed: " + h.Hands.getGrabbed());
        String idk = "Go to school";
        System.out.println(
                h.Head.isItGood(idk) ? (idk + " is good idea") : (idk + " is bad idea")
        );
        h.Legs.moveTo(new Point(100,140));
        System.out.println("Current loc is: x=" + h.Legs.getCurrentLoc().x + " y=" + h.Legs.getCurrentLoc().y);
    }
}
