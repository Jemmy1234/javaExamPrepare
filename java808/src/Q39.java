public class Q39 {
    char c;
    boolean b;
    float f;

    void printAll() {
        System.out.println("c = " + c);
        System.out.println("c = " + b);
        System.out.println("c = " + f);
    }

    public static void main(String args[]) {
        Q39 f = new Q39();
        f.printAll();
    }
}

/**
 * 本題重點:
 * java 會預設主要型態初始值
 * boolean 為 flase, float 為 0.0 , char 為 空字元 (不是 null), String 為 null
 */