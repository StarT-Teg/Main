import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_now {


    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd mm yyyy");

        System.out.println(formatForDateNow.format(date));
    }
}