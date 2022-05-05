package Q101_150;

public class Q120 {
    public static void main(String[] args) {
        String str1 = "java";
        char str2[] = { 'J', 'a', 'v', 'a' };
        String str3 = null;
        for (char c : str2)
            str3 = str3 + c;
        // System.out.println(str3);
        if (str1.equals(str3))
            System.out.println("Successful");
        else
            System.out.println("Unsuccessful");
    }
}

/**
 * 本題重點:
 * 在 java 裡，null + 字元或字串連接是可被允許的
 * 當進行 null + 字串連接時，null 會自動被改為長度為 4 的 "null" 字串
 * 因此 str3 最後會變成 "nullJava"
 * 
 * 注意:
 * + 的運算元至少有一個是物件或字串才能當作字串連接
 * 其他的都不行，例如 字元 或 null 皆不行
 * 而字元的 + 運算會被視為字元值做加法運算
 * 
 * 參考資料: https://bit.ly/3FlIdga
 */
