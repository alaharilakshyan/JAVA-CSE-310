import java.time.LocalTime;
import java.time.Duration;
class DurationExample{
    public static void main(String args[]){
        LocalTime startTime = LocalTime.of(9, 0); // 9:00 AM
        LocalTime endTime = LocalTime.of(17, 0); // 5:00 PM

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration.toHours() + " hours and " + duration.toMinutes() % 60 + " minutes");
    }
}