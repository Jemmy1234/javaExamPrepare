public class Q18 {
    public static void main(String[] args) {
        // int day = 1;
        String day = "1"; // first solution
        switch (day) {
            case "7":
                System.out.print("Uranus");
            case "6":
                System.out.print("Saturn");
            case "1":
                System.out.print("Mercury");
            case "2":
                System.out.print("Venus");
            case "3":
                System.out.print("Earth");
            case "4":
                System.out.print("Mars");
            case "5":
                System.out.print("Jupiter");

                // Second solution , change case to Integer
                // case 5: System.out.print("Jupiter");
        }
    }
}

/**
 * 1. switch 可以判斷數字和文字類型，兩者皆可
 * 2. break 和 default 都只是可選的，不要也沒關係
 */