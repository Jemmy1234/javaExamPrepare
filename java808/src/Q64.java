import java.util.ArrayList;
import java.util.List;

public class Q64 {
    public static void main(String[] args) {
        // 以下這行錯誤
        // List<int> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        list.add(21); list.add(13);
        list.add(30); list.add(11);
        list.removeIf(e -> e%2 != 0);
        System.out.println(list);
    }
}

/**
 * 本題會發生 Compilation fails
 * 1. Collections 不能放置 primitive data types 
 * 2. 若要放置數字，需要做 AutoBoxing 也就是可以放置 Integer 取代
 */
