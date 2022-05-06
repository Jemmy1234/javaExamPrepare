package Q101_150;

public class Q138 {
    
}


// Which option lists only those classes that belong to the unchecked exception
// category?
// A. AssertionError, ArrayIndexOutOfBoundsException, ArithmeticException
// B. AssertionError, IOError , IOException
// C. ArithmeticException, FileNotFoundException, NumberFormatException
// D. FileNotFoundException, IOException, SQLException
// E. ArrayIndexOutOfBoundException, IllegalArgumentException,
// FileNotFoundException

/**
 * Answer: A
 * B -> IOException是需要檢查的例外
 * C -> FileNotFoundException是需要檢查的例外
 * D -> 全都是需要檢查的例外
 * E -> FileNotFoundException是需要檢查的例外
 * 
 * 參考資料：
 * https://i.stack.imgur.com/xYo82.png
 * https://chercher.tech/images/java-programming/exception-architechture-java.png
 * 
 */