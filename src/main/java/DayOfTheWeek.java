import java.util.Arrays;

public class DayOfTheWeek {

    //given day of the week represented by 3 letters, add the days (K) and return the day of the week after K days
    //i.e. given Sat, 23 days later, it'll be Mon
    public static void main(String[] args) {
        String dayOfWeek= getDayOfWeek("Sat", 23);
        System.out.println(dayOfWeek);

    }

    public static String getDayOfWeek(String S, int K) {
        String[] daysOfTheWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int indexOfDay= Arrays.asList(daysOfTheWeek).indexOf(S);
        int remainder = K % 7;

        int indexAfterKDays = (remainder + indexOfDay) % 7;

        return daysOfTheWeek[indexAfterKDays];
    }
}
