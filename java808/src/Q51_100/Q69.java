package Q51_100;
public class Q69 {
    public static void main(String args[]) {
        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3 + 4));
    }
}


/**
 * 答案是 : 
 * 5+2 = 34
 * 5+2 = 7
 * 
 * 重點: 
 * 1. 運算子 + 若其中一個運算元為字串，則就會做字串連結，否則為加法運算
 * 2. print 裡也可以做加法運算
 */