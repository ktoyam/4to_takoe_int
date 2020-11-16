package pract20;

import java.io.File;
import java.util.Scanner;

public class showCatalogs {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        var dir = sc.nextLine();
        var files = new File(dir).listFiles();
        for(int i = 0; i< files.length && i<5;i++){
            System.out.print(files[i].isFile() ? "File: " : "Folder: ");
            System.out.println(files[i].getName());
        }
    }
}
