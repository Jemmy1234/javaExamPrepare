package Q1_50;

public class Q21 {
    public void doList() throws Exception {
        throw new Error("Error");
    }

    public void doPrint() throws Exception {
        throw new RuntimeException("Exception");
    }

    public static void main(String[] args) {
        Q21 t = new Q21();
        try {
            t.doPrint();
            t.doList();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
        // 如果要抓 doList 的錯誤要加上以下幾行
        // catch (Error e3) {
        //     System.out.println("Caught " + e3);
        // }
    }
}

/**
 * 1. 這題其實只是考細心程度，因為丟了第一個例外進到 Catch 後，程式就結束了
 * 2. 如果順序對調，先執行 doList()，則會進不去 Catch 因為抓不到 Error 錯誤
 */


