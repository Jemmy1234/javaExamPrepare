package Q51_100;
public class Q88 {
    public static void main(String[] args) {
        float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);
    }
}

/**
 * 答案 : 13480.0
 * 
 * 本題重點:
 * Java 為了增加可讀性，從 Java7 開始允許在數字中加上底線
 * 結果和沒有增加底線是一樣的
 * 
 * 重點在於一些規範:
 * 1. 每種資料型態皆可用
 * 2. 不能接在小數點前後
 * 3. 不能接在 L 前後
 * 4. 不能加在結尾
 * 5. 不能加在 0x 前後或中間
 * 6. 也不能放在開頭，不然會被當做是變數
 */