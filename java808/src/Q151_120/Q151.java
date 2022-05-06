package Q151_120;

public class Q151 {
    public static void main(String[] args) {
        float x = 22.00f % 3.00f;
        int y = 22 % 3;
        System.out.print(x + ", " + y);
    }
}

/**
 * 答案是 1.0, 1
 * 
 * 注意: 不是 1.0f, 1
 * 
 * 本題重點:
 * float 是單精度， 會用到 32 bits
 * double 是倍精度，會用到 64 bits
 * 若沒有特別指定，則符點數會用 double 去存
 * 所以在符點數後面寫 f 是特別去區分說這個符點數要用 float 去存
 * 如果寫 double b = (float)4.0 不會出錯
 * 但是寫 float b = (double)4.0 就會出錯，因為記憶體不夠存放
 */