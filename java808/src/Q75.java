public class Q75 {
    String name;
    boolean contract;
    double salary;

    Q75() {
        // 以下 OK
        // this.name = new String("Joe");
        // this.contract = new Boolean(true);
        // this.salary = new Double(100);

        // 以下不行
        // name = "Joe";
        // contract = TRUE;
        // salary = 100.0f;
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Q75 e = new Q75();
        // 以下 OK
        // e.name = "Joe";
        // e.contract = true;
        // e.salary = 100;
        System.out.print(e);
    }
}

/**
 * 這題其實只是騙人，contract = TRUE 這行會有問題
 * 因為 boolean 的 true 只能寫小寫
 * 如果改成小寫的 true 就完全沒問題
 */
