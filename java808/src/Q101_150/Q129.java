package Q101_150;

public class Q129 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d2;
        // 這裡共產生了幾個物件?
    }
}

class Dog {
    Dog() {
        try {
            throw new Exception();
        } catch (Exception e) {
        }
    }
}

/**
 * 答案: 4個
 * 不要忘記每次產生一個 Dog 物件時，也會產生一個 Exception 物件
 * 所以是 4 個
 */