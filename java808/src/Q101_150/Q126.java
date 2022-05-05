package Q101_150;

public class Q126 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (SpecialException e) {
            System.out.println(e);
        }
    }

    static void doSomething() throws SpecialException {
        int[] ages = new int[4];
        ages[4] = 17;
        doSomethingElse();
    }

    static void doSomethingElse() throws SpecialException {
        throw new SpecialException("Thrown at end " +
                "of doSomething() method");
    }
}

class SpecialException extends Exception {
    public SpecialException(String message) {
        super(message);
        System.out.println(message);
    }
}

/**
 * 結果:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at Q101_150.Q126.doSomething(Q126.java:14)
        at Q101_150.Q126.main(Q126.java:6)

    重點:
    ArrayIndexOutOfBoundsException 並不是 SpecialException 所以並不會被 catch
    因次會從 main 再繼續往外拋出
 */