package main.fpij.cap4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GregorianCalen {

    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd MM yyyy");
        Date date = df.parse("02 26 1991");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // The third line could be replaced with:
        System.out.println("cal" + cal);
//        Calendar cal = new GregorianCalendar();
    }

}
