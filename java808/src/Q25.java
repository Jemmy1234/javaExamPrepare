public class Q25 {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arry[] = {1,3,5,7,8,9};
        int index = arry.length;
        // while ( <code1>) {
        while (index > 0) {
            if (arry[index-1] % 2 ==0) {
            isChecked = true;
        }
            // <code2>
            index--;
            // 這裡寫 index--  或 --index 皆相同
        }
        System.out.print(arry[index]+", "+ isChecked);
    }    
}

/**
 * 1. 這題要印出 1, true
 * 2. 這題反推即可，考驗細心
 * 3. 重點是要知道 <code1> 這裡，不能放 index 的原因
 * 是因為 while condition 只能接受 boolean 不能接受數字
 * java 不支援在 while condition 裡直接放置數字0為 false 的概念
 */