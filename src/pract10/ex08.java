package pract10;

public class ex08 {
    public static void main(String[] args) {
        System.out.println(PalindromNORMAL("A DAAD A"));
    }

    public static String PalindromRECURSIVE(char[] word, int offset){
        if(offset*2 == word.length) return "YES";
        else if(word[offset]!=word[word.length-1- offset]){
            return "NO";
        }
        else return PalindromRECURSIVE(word, offset+1);
    }
    public static String PalindromNORMAL(String word){
        if(word.length()%2!=0) return "NO";
        else return PalindromRECURSIVE(word.toCharArray(), 0);
    }
}
