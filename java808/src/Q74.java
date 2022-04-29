public class Q74 {
    public static void main(String args[]) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}

class Vehicle {
    int x;

    Vehicle() {
        this(10); // line n1
    }

    Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle {
    int y;

    Car() {
        super();

        // 如果以下這行沒有註解掉會出錯
        // this(20); // line n2
    }

    Car(int y) {
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }
}

/**
 * 1. 本題重點: Super 和 this 在建構式裡只能擇一呼叫，且一定要在第一行
 * 2. 若未加入任何建構子，則編譯器會主動加入未帶參數的建構子
 * 3. 若手動加入建構子，無論有無參數，編譯器都不會再幫忙加入未帶參數的建構子
 * 4. 此時若子類別裡沒有強制呼叫父類別的建構子的話，有可能會早成呼叫不到父類別建構子的現象
 *
 * 參考資料: https://bit.ly/3MVuuiL
 */