public class Q38 {
    static void doubling(Integer ref, int pv) {
        ref = 20;
        pv = 20;
    }

    public static void main(String[] args) {
        Integer iObj = new Integer(10);
        int iVar = 10;
        doubling(iObj++, iVar++);
        System.out.println(iObj + ", " + iVar);
    }
}

/**
 * 1. 本題答案為 11, 11
 * 2. Java 裡只有 Call by value
 * 3. 對於基本型態來說，就是直接複製值
 * 4. 對於物件型態來說，就是複製位址
 * 5. Integer 如果是做 AutoBoxing 的話，如果已經有相同的值存在，則會使用同一個物件
 * 但如果值不同的話，會再開創一個 Integer 物件來做包裝 (因為 Integer 為 immutable)
 * 6. 本題的 Integer 物件在傳進函式時，的確是把 iObj 位址傳進去，
 * 但是因為 ref 指定了一個新的值給它，導致在此時產生了一個新的 Integer 物件來包裝，
 * 因此 iObj++ 時其實還是只影響到原本的 iObj 物件的值而已
 * 
 * 參考資料: https://bit.ly/3OHxwsw
 */