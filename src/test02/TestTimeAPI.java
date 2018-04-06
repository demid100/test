package test02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Set;

public class TestTimeAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate feb = LocalDate.of(2014, Month.MAY, 10);
        System.out.println(feb);

        LocalDate birth = LocalDate.ofYearDay(1989, 147);
        System.out.println(birth);

        LocalTime now = LocalTime.now();
        LocalTime midday = LocalTime.of(12, 00);
        System.out.println(now);
        System.out.println(midday);

        Set<String>  set = ZoneId.getAvailableZoneIds();

        int count = 1;

        for (String string : set) {
            System.out.println(count++ + " " + string);

        }


    }


}
