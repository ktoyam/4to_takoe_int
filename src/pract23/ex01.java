package pract23;

import java.util.ArrayList;
import java.util.HashMap;

public class ex01 {
    public static void main(String[] args) {
        HashMap<String, String> ppl = new HashMap<>();
        ppl.put("F1", "N1");
        ppl.put("F2", "N2");
        ppl.put("F3", "N1");

        ArrayList<String> keysToRemove = new ArrayList<>();
        ppl.forEach((s1,n1)-> ppl.forEach((s2, n2)->{
            if(s1.equals(s2)) return;
            if(n1.equals(n2)) keysToRemove.add(s2);
        }));
        keysToRemove.forEach(ppl::remove);

        System.out.println(ppl);
    }
}
