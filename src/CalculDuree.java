import java.time.Duration;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CalculDuree {
    public static Duration calculerDuree(Date debutPeine, Date finPeine) {
        long diff = finPeine.getTime() - debutPeine.getTime();
        return Duration.ofMillis(diff);
    }

    public static Date formaterDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}