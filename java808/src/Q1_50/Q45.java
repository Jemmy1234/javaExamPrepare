package Q1_50;
public class Q45 {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Q45 ex = new Q45();
        int cardNo = 12344;
        ex.checkCard(cardNo); // line n2

        // 以下這行若不註解則會編譯錯誤
        // ex.readCard(cardNo); // line n3
    }
}

/**
 * 這題的重點在於
 * 
 * Exception 分為 RuntimeException(Unchecked) 及 Checked 兩種，
 * 若為 RuntimeException 則編譯器不強制檢查，
 * 但若是 Checked 則強制需做 try/catch 或是拋出異常，否則會編譯錯誤 
 * 
 * 參考資料: https://bit.ly/3KxECN3
 */
