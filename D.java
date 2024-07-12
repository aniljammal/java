import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

 class DayOfWeek {
    public static String getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(31, 8, 2019)); 
        System.out.println(getDayOfWeek(18, 7, 1999)); 
        System.out.println(getDayOfWeek(15, 8, 1993)); 
    }
}
