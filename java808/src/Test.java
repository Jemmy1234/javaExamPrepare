import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] a = { 3, 5 };

        try {
            throw new UserException("This is test");
        } catch (RuntimeException e) {
            System.out.println("2 error");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("1 error");
            e.printStackTrace();
        }
    }
}

class UserException extends Exception {
    public UserException(String s) {
        System.out.println("s = " + s);
    }
}
