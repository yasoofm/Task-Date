import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateTime {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println("Time now is " + now);

        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days is " + futureDate);

        System.out.println("DAY_OF_MONTH value is " + Calendar.DAY_OF_MONTH);
        System.out.println("DAY_OF_WEEK value is " + Calendar.DAY_OF_WEEK);
        System.out.println("DAY_OF_YEAR value is " + Calendar.DAY_OF_YEAR);

        System.out.println("**********************************************");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(now);
        System.out.println("Fornatted Date: " + formattedDate);

        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        futureDate = calendar.getTime();
        String formattedFutureDate = formatter.format(futureDate);
        System.out.println("Date after 5 days: " + formattedFutureDate);
    }
}
