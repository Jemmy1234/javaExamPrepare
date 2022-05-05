package Q101_150;

public class Q130 {
    public static void main(int[] args) {
        System.out.println("int main " + args[0]);
    }

    public static void main(Object[] args) {
        System.out.println("O bject main " + args[0]);
    }

    public static void main(String[] args) {
        System.out.println("String main " + args[0]);
    }
}

// javac Q130.java
// Java MainTest 1 2 3

/**
 * 答案是 String main 1
 * 重點: public static void main(String[] args) 是固定的 Java 程式進入點
 * 不會改變
 */