import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversionExample {
    public static void main(String[] args) {
        String htmlDateString = "25-08-2023";

        SimpleDateFormat htmlFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat mysqlFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = htmlFormat.parse(htmlDateString);
            String mysqlFormattedDate = mysqlFormat.format(date);
            System.out.println("MySQL formatted date: " + mysqlFormattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
