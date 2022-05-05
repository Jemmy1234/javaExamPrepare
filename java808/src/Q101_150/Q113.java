package Q101_150;

import java.util.ArrayList;

public class Q113 {
    public static void main(String args[]) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                // 以下這行會拋出 OutOfMemoryError
                myList.add("My String");
            }
        } catch (RuntimeException re) {
            System.out.println("Caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}

/**
 * 本題重點: 
 * 當記憶體不夠將字串添加至ArrayList物件的時候，就會產生OutOfMemoryError
 * 
 * 因此答案是 A runtime error is thrown in the thread "main"
 */