package pract31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ip {

    private final static String IPV4_REG = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}"
            +"([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
    private final static Pattern IPV4_PATTERN = Pattern.compile(IPV4_REG);

    public static boolean isValid(String ip){
        Matcher m = IPV4_PATTERN.matcher(ip);
        return m.matches();
    }
}
