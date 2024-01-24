import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Geef uw geboortedatum in (dd/mm/yyyy)");
        Scanner scanner = new Scanner(System.in);
        String geboorteDatumAlsString = scanner.next();
        LocalDate geboortedatum = LocalDate.parse(geboorteDatumAlsString, formatter);
        System.out.println("Weekdag: " + geboortedatum.getDayOfWeek());
        Period period = Period.between(geboortedatum, LocalDate.now());

        System.out.println("Jij bent " + period.getYears() + " jaar oud.");
        System.out.println("Jij bent " + ChronoUnit.YEARS.between(geboortedatum, LocalDate.now()) + " jaar oud.");
    }
}
