package Q1_50;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q8 {
    public static void main(String[] args) throws Exception {
        String date = LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.print(date);
    }
}

/**
 * 
// 使用 LocalDateTime 才能搭配 DateTimeFormatter
// 若只使用 LocalDate 會沒有時間資訊，再加上 DateTimeFormatter 的話就會出錯
// 記得 LocalDateTime 的字串輸入格式 日期和時間的寫法有差異

DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm/ss");
System.out.println(LocalDateTime.parse("2019-03-06T23:05:21").format(df));

參考資料:
https://www.baeldung.com/java-datetimeformatter
 */
