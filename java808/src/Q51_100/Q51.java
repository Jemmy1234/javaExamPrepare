package Q51_100;
class Base {
    public void test() {
        System.out.println("Base ");
    }
}

class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA ");
    }
}

public class Q51 extends DerivedA {
    public void test() {
        System.out.println("DerivedB ");
    }

    public static void main(String[] args){
        Base b1 = new Q51();
        Base b2 = new DerivedA();
        Base b3 = new Q51();

        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;

        b1.test();
        b4.test();
    }
}

/**
 * 答案: DerivedB DerivedB
 * 本題重點: 多型要看的是被 new 出來的實體來決定函式執行的內容
 * 無論子類別實體是否被強制轉型成父類別，當執行函式時還是會以子類別的內容為主
 * 另外一方面，使用父類別的變數型態，完全無法決定子類別在執行函式時會發生的結果是什麼
 * 這是多型的意義，意即讓子類別擁有最終決定權。
 * 如果子類别想要在自己的函式裡使用父類別的內容，可以直接使用 super
 */
