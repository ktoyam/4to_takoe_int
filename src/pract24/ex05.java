package pract24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        var fpath = sc.nextLine();
        var line = Files.readString(Paths.get(fpath));
        var res = getLine(line);
        System.out.println(res);
    }

    public static String getLine(String l){
        StringBuilder sb = new StringBuilder(l.length());
        var lines  =Arrays.asList(l.split(" "));
        boolean isok;

        do {
            isok = true;
            for (int i = 1; i < lines.size(); i++) {
                if (lines.get(i).charAt(0) != lines.get(i-1).charAt(lines.get(i-1).length() - 1)) {
                    isok = false;
                    break;
                }
            }
            if(!isok) Collections.shuffle(lines);
        }
        while(!isok);
        lines.forEach((sb::append));
        return sb.toString();
    }
}
