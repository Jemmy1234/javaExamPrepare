import java.time.LocalTime;

public class Q81 {
    public static void main(String args[]) {
        //Which of the following will print current time?
        
        //Absolutely wrong，LocalTime no need constructor
        // System.out.print(new LocalTime() - now0);
        
        //Absolutely wrong，LocalTime no need constructor
        // System.out.print(new LocalTime());

        // The right method to invoke LocalTime
        System.out.print(LocalTime.now());

        // Wrong, because LocalTime no today function
        // System.out.print(LocalTime.today());
    }
}

/**
 * 對於 Java8 時間的用法(LocalTime, LocalDate, LocalDateTime, Instant, ZonedDateTime)
 * 可以參考這篇 :　https://bit.ly/37SGum6
 */
