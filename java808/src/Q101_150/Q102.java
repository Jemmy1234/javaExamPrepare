package Q101_150;

class Alpha {
    public String[] main = new String[2];

    Alpha(String[] main) {
        for (int ii = 0; ii < main.length; ii++) {
            this.main[ii] = main[ii] + 5;
        }
    }

    public void main() {
        System.out.print(main[0] + main[1]);
    }
}

public class Q102 {
    public static void main(String[] args) {
        // 這裡輸入的參數為 1 2
        Alpha main = new Alpha(args);
        main.main();
    }
}

/**
 * 答案為 1525
 * 記得輸入時是字串，在 for 迴圈裡計算是也是字串
 * 所以在做 main[ii] + 5 時，會當作字串處理，所以會變成 "15"
 */