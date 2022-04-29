public class Q76 {
    static double area = 0;
    int b = 2, h = 3;

    public static void main(String[] args) {
        double p, b, h; // line n1
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
        }
        // 以下這行會出錯
        // area = p * b * h; // line n2
        System.out.println("Area is " + area);
    }
}

/**
 * 第13行出錯的原因是因為 三個變數皆沒有初始化
 * 如果加個 else 在初始化的話就不會出錯
 * 另外，如果是 double 陣列的話就會先分配初始值為 0.0
 * 但是若是一般宣告變數的話，就不會給初始值，必需強制手動初始化
 */
