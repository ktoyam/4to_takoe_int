package pract22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStuff {
    public static Date getFrom1(String inp) throws ParseException {
        return  new SimpleDateFormat("<yyyy><MM><dd><hh><mm>").parse(inp);
    }
}
