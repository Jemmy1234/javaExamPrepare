package Q1_50;
public class Q20 {
    public static void main(String args[]) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

class Alpha {
    int ns;
    static int s;

    Alpha(int ns) {
        if(s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}

/**
 * 1. JVM 起始過程為 Class variable init -> Static init -> main
 * 2. static 變數 是屬於類別的變數，所以是在 Class variable init 階段就會產生
 * 3. 以 static int b; 為例，先針對 static int 創造出預設值0，然後再創造一個變數b
 * 然後再將 b 指向 0
 * 4. 類別變數也是一樣，會初始化為 0
 * 5. 但 local 變數的 int 在沒有初始化之前就使用的話會產生編譯錯誤
 * 
 * 參考資料:
 * https://www.baeldung.com/java-static-variables-initialization
 */
