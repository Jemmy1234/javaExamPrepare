import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String arra[][] = new String[3][];
        arra[0] = new String[] { "rose", "lily" };
        arra[1] = new String[] { "apple", "berry", "cherry", "grapes" };
        arra[0] = new String[] { "beans", "carrot", "potato" };
        // insert

        for (String a[]:arra[][]) { 
            for (String x:a[]) { 
                toUpperCase(); 
            } 
        }
    }
}
