package pract24;

public class Shirt {
    final private String ss;
    final private String n;
    final private String c;
    final private String s;


    public Shirt(String str){
        var lines = str.split(",");
        ss = lines[0];
        n = lines[1];
        c = lines[2];
        s = lines[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "ss='" + ss + '\'' +
                ", n='" + n + '\'' +
                ", c='" + c + '\'' +
                ", s='" + s + '\'' +
                '}';
    }
}
