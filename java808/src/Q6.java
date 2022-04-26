import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q6 {
    public static void main(String[] args) throws Exception {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);

        DateTimeFormatter.ISO_DATE_TIME.format(LocalDate.of(2018, 3, 9));
    }
}

/**
 * 
// 日期字串轉換成LocalDate
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
LocalDate localDate = LocalDate.parse(dateStr, formatter);

// LocalDate轉換回日期字串
dateStr = localDate.format(formatter);
System.out.println(dateStr); // 2019/08/15

參考資料:
https://www.baeldung.com/java-datetimeformatter
 */
