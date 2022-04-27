public class Q49 {
    public static void main(String args[]) {
        String str = " ";
        str.trim();
        System.out.println(str.equals("") + " " + str.isEmpty());
    }
}

/**
 * 本題答案是 false false
 * 1. String 是不可變的，因此 String 的方法幾乎都有 return，且不會改變到原有的 String
 */