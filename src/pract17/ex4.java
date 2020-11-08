package pract17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        String path = "output.txt";
        File f = new File(path);
        if(!f.exists()) {
            System.out.println("file not exists");
            return;
        }
        try(FileWriter fw = new FileWriter(f, true)) {
            Scanner s = new Scanner(System.in);
            String inp;
            System.out.println("Enter info to append or '0' to exit:");
            while(!(inp=s.nextLine()).contentEquals("0")){
                fw.append(inp);
                fw.append('\n');
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
