import java.time.LocalDate;
import java.time.Period;
class FormatterperiodExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        LocalDate end = LocalDate.of(2025, 3, 25);
        System.out.println("Specific Date: " + end);

        Period period = Period.between(today, end);
        System.out.println("Period between today and specific date: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}