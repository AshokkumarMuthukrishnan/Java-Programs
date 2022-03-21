package strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {
        String str = "2022-03-19";
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
