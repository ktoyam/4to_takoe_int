package pract23;

import java.util.ArrayList;
import java.util.HashMap;

public class ex02 {

    public static void main(String[] args){
        //country-cities
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        add(map, "Russia", "Moscow");
        add(map, "Russia","Saint Petersburg");
        add(map, "Россия", "Волгоград");
        add(map, "Россия", "Челябинск");
        System.out.println(map);
    }

    static void add(HashMap<String, ArrayList<String>> map, String c, String s){
        if(map.containsKey(c)){
            map.get(c).add(s);
        }
        else{
            var l = new ArrayList<String>();
            l.add(s);
            map.put(c,l);
        }
    }
}

class City{
    public String N;
    public String C;
}
