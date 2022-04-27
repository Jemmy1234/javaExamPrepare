public class Q36 {
    public static void main(String[] args) {
        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.println(c + "");
            }
            System.out.println();
        }
    }
}

/**
 * 1. 答案是 97 98 99 100 null null null
 * 2. java 裡，只有第一維陣列一定要宣告，第二維可以不用宣告
 * 3. 第二維陣列長度可以每一列都不一樣長
 * 4. 當陣列初始化後，會填入初始值，字串為 null, 整數為0, 字元為 '\0000', boolean 為 false
 * 
 * 參考資料: https://bit.ly/3MAr2tk
 * 
 */
