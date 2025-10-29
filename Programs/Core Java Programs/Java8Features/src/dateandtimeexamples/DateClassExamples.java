package dateandtimeexamples;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateClassExamples {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Current Date "+ld);
        LocalDate ld1 = LocalDate.of(2000,10,20);
        System.out.println("Past Date "+ld1);
        String dateInStringFormat = "2025-09-06";
        LocalDate ld2 = LocalDate.parse(dateInStringFormat);
        System.out.println(ld2);
        // convert default date format to custom format
        String dateInfo = ld.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(dateInfo);
        System.out.println("-----------------------");
        LocalTime lt = LocalTime.now();
        System.out.println("Current time "+lt);
        System.out.println("-------------");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Current Date and Time "+ldt);
        String dateAndTime = ldt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Custom Date and Time "+dateAndTime);
        System.out.println("------------------");
        //LocalDateTime ldtZoneInfo = LocalDateTime.n
        Set<String> ss = ZoneId.getAvailableZoneIds();
        //ss.forEach(z->System.out.println(z));
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Merida"));
        System.out.println("America/Merida "+zdt);
    }
}
