package Q1_50;
public class Q23 {
    public static void main(String[] args) {
        try {
            String[] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";
            for (String var : arr) {
                System.out.print(var + " ");
            }
        } catch (Exception e) {
            System.out.print(e.getClass());
        }
    }
}

/**
 * 1. 這題的重點是，陣列在初始化後，由於已經配置好空間了
 * 裡面的每個元素就會自動配置了初始值
 * 2. 如果是 int 則預設值就自動為 0
 * 3. 如果是 boolean 預設值就為 false
 * 4. 如果是 objects (包括 String/Integer或其他的物件)，預設值就會是 null
 * 5. 所以陣列初始化後，即使沒有對 element 設定值，直接取值也不會出錯
 */