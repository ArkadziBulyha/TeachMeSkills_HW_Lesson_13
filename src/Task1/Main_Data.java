package Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main_Data {

        public static void main(String[] args) {
            dayOfWeek();
            dateNextTuesday();
        }

        private static void dayOfWeek() {

            String input_date = "03/10/1996";
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            Date dt = null;
            try {
                dt = format.parse(input_date);
            } catch (ParseException e) {
                System.out.println("error");
            }

            String whatIsDay = new SimpleDateFormat("EEEE").format(dt);
            System.out.println(whatIsDay);

        }

        private static void dateNextTuesday(){

        int dayOfWeek = 3; // Вторник
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);

        int days = 7 - weekday + dayOfWeek;
        now.add(Calendar.DAY_OF_YEAR, days);

        Date dt = now.getTime();
        String dtStr = new SimpleDateFormat("EEEE dd.MM.yyyy").format(dt);
        System.out.println(dtStr);
    }
}
