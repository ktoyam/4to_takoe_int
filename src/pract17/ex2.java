package pract17;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("output.txt")) {
            System.out.println("Info from file:");
            Scanner s = new Scanner(fr);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
