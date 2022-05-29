package singleton;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateUtil {

    private DateUtil() {
    }

    private static DateUtil dateUtil;

    public static DateUtil getInstance() {
        if (null == dateUtil) {
            dateUtil = new DateUtil();
        }
        return dateUtil;
    }

    public Instant toInstant(LocalDate localDate){
        return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
    }
}
