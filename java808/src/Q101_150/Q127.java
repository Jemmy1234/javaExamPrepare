package Q101_150;

public class Q127 extends Planet {
    // void revolve() {} // line n3

    protected void rotate() {} // line n4
}

abstract class Planet {
    protected void revolve() {} // line n1

    abstract void rotate(); // line n2
}

/**
 * 答案: Line3 會出錯，因為 Planet 的 revolve() 是 protected
 * 因此繼承之後，修飾條件不能小於 protected 所以 n3 必須要加上 public 或 protected
 * 
 * 而 rotate 在父類別中是 default ，因此在子類別中要大於 default
 * 因此使用 protected 或是 public 或是不加修飾子皆可
 */