package pract24;

public class TelNum {
    public static String convert(String inp){
        StringBuilder sb = new StringBuilder(inp);
        if(sb.charAt(0) == '8' && sb.length()==11) sb.replace(0,1,"+7");
        sb.insert(sb.length()-4, '-');
        sb.insert(sb.length()-8, '-');
        return sb.toString();
    }
}
