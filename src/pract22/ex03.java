package pract22;

import java.text.ParseException;
import java.util.Date;

public class ex03 {
    public static void main(String[] args){
        try {
            System.out.println("Дата: "+ DateStuff.getFrom1("<2020><12><10><04><20>"));
            System.out.println("АХАХАХАХАХАХАХ");
            System.out.println("Сейчас: " + new Date());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
