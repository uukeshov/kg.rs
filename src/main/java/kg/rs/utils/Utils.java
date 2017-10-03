package kg.rs.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String getTime() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:S");
        return formatForDateNow.format(dateNow);
    }
}
