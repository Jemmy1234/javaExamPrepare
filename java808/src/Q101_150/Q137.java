package Q101_150;

public class Q137 {
    public static void main(String[] args) {
        Z obj = new Z();
        System.out.println(obj.x3 + ", " + obj.y1 + ", " + obj.z1);
    }
}

class X {
 
    int x1, x2, x3;
}
 
class Y extends X {
 
    int y1;
 
    Y() {
        x1 = 1;
        x2 = 2;
        y1 = 10;
    }
}
 
class Z extends Y {
 
    int z1;
 
    Z() {
        x1 = 3;
        y1 = 20;
        z1 = 100;
    }
}

// Which constructor initializes the variable x3?
// Ans: Only the default constructor of class X

/**
 * 重點1 : 由於呼叫 Z() 時會呼叫 Y建構子 ，又會去呼叫 X 建構子，而 x3 變數從沒有被
 * 初始化過，因此會在 X 預設建構子中初始化
 * 
 * 重點2 : 區域變數若未設初始值就使用的話會發生編譯錯誤，
 * 但是若是 instance 在初始化時就會將類別內的變數皆設成初始值
 * 所以在 instance 初始化後就可以直接使用物件變數，會得到初始值
 */