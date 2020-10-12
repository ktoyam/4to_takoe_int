package pract10;

public class ex03 {
    public static void main(String[] args) {
        ShowSeq("1", "0");
    }

    private static void ShowSeq(String a1, String a2) {
        int a1i = Integer.parseInt(a1);
        int a2i = Integer.parseInt(a2);
        if (a2i > a1i)
            for (; a1i <= a2i; a1i++)
                System.out.println(a1i);
        else
            for (; a1i >= a2i; a1i--)
                System.out.println(a1i);

    }
}
