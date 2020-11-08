package pract17;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("output.txt")) {
            Scanner s = new Scanner(System.in);
            String inp;
            System.out.println("Enter info or '0' to exit:");
            while(!(inp=s.nextLine()).contentEquals("0")){
                fw.write(inp);
                fw.write('\n');
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
