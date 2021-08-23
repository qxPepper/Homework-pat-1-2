import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Logger {
    private static Logger logger = null;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
        String formattedDate = dateFormat.format(date);

        System.out.println("[" + formattedDate + " " + num++ + "] " + msg);
    }
}
