package Q151_120;

public class Q156 {

    public static void main(String args[]) {
        String s = "A";
        switch (s) {
            case "a":
                System.out.println("simaple A");
            default:
                System.out.println("default");
            case "A":
                System.out.println("Captial A");
        }
    }
}

/**
 * 答案: Captial A
 * 
 * 本題重點:
 * 1. default 的擺放位置並不會影響到判斷的順序，一樣從每個 case
 * 開始比對，若沒有符合的最後才走 default
 * 
 */