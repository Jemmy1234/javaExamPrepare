package Q51_100;
public class Q99 {
    static void dispResult(int[] num) {
        try {
            // 這行會因為 num[2] 不存在，所以會拋出 Exception
            System.out.println(num[1] / (num[1] - num[2]));
        } catch (ArithmeticException e) {
            System.out.println("first exception");
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        try {
            int[] arr = { 100, 100 };
            dispResult(arr);
        } catch (IllegalArgumentException e) {
            System.err.println("Second exception");
        } catch (Exception e) {
            System.err.println("third exception");
        }
    }
}

/**
 * num[2] 不存在，所以會發生 ArrayIndexOutOfBoundsException
 * ArrayIndexOutOfBoundsException => 陣列索引值小於0或超過陣列邊界
 * ArithmeticException => 由於數學運算時產生的例外
 * IllegalArgumentException => 方法呼叫時參數型態不同
 * NullPointerException => 物件值為null產生的例外
 * ArrayStoreException => 儲存陣列元素型態不符
 */
