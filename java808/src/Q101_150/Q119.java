package Q101_150;

public class Q119 {
    public static void main(String args[]) {
        //insert code here

        // // A
        // int [] [] arr = null;
        
        // // B
        // int [] [] arr = new int [2];

        // // C
        int [] [] arr = new int [2] [];

        // // D
        // int [] [] arr = new int [] [4];

        // // E
        // int [] [] arr = new int [2] [0];

        // // F
        // int [] [] arr = new int [0] [4];

        arr[0] = new int[3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1] = new int[4];
        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;
        arr[1][3] = 40;
    }
}

/**
 * 答案是 C, E
 * B => 無法把一維陣列轉至二維陣列，無法編譯
 * C => 第二維一開始沒指定沒關係
 * D => 第一維不可為空，無法編譯
 * E => 雖然第二維一開始設定為0，但是程式中後來還是針對 a[0]和 a[1] 又重新設定新的長度
 * F => 第一維為0，會錯誤 (ArrayIndexOutOfBoundsException)
 */