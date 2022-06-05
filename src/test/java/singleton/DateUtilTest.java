package singleton;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateUtilTest {

    @Test
    void shouldReturnSameDateUtilInstanceForMultipleCallsInSameThread(){
        var dateUtil1 = DateUtil.getInstance();
        var dateUtil2 = DateUtil.getInstance();
        var dateUtil3 = DateUtil.getInstance();

        assertEquals(dateUtil1, dateUtil2);
        assertEquals(dateUtil1, dateUtil3);
        assertEquals(dateUtil2, dateUtil3);
    }

    @Test
    void shouldConvertLocalDateToInstantDate() {
        var localDate = LocalDate.parse("2022-05-30");
        var expectedInstant = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
        var dateUtil = DateUtil.getInstance();

        var date = dateUtil.toInstant(localDate);

        assertEquals(expectedInstant, date);
    }
}
