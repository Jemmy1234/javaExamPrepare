package Q101_150;

import java.util.ArrayList;
import java.util.List;

public class Q123 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21); list.add(13);
        list.add(30); list.add(11);
        list.add(2);
        //insert here to output [21, 13, 11]

        System.out.println(list);
    }
}

/**
 * 本題答案是 list.removeIf(e -> e%2 == 0)
 * 
 * 重點1:
 * list.remove(e) 裡面是放物件
 * list.removeIf(funtion) 裡面是放 lambda
 */
