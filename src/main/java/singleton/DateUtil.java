package singleton;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateUtil {

    private DateUtil() {
    }
    /*
    * thread-unsafe lazy-loaded singleton
    */
    private static DateUtil dateUtilInstance;

    public static DateUtil getInstance() {
        if (null == dateUtilInstance) {
            dateUtilInstance = new DateUtil();
        }
        return dateUtilInstance;
    }

    public Instant toInstant(LocalDate localDate){
        return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
    }
}
