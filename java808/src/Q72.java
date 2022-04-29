public class Q72 {
    int sum = 0;

    public void doCheck(int number) {
        if (number % 2 == 0) {
            // 如果這行不註解掉會出錯
            // break;
        } else {
            for (int i = 0; i < number; i++) {
                sum += i;
            }
        }
    }

    public static void main(String[] args) {
        Q72 obj = new Q72();
        System.out.println("Red " + obj.sum);
        obj.doCheck(2);
        System.out.println("Orange " + obj.sum);

        obj.doCheck(3);
        System.out.println("Green " + obj.sum);
    }
}

/**
 * break 只能用在循環結構和 switch 結構，其他的地方使用 break 會編譯錯誤
 */