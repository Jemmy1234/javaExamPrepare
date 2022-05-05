package Q1_50;
public abstract class Q35 {
    private int x;
    private int y;

    public abstract void draw();

    public void setAnchor(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

/**
 * Which two classes use the shape class correctly?

A.
public class Circle implements Shape{
    private int radius;
}
B.
public abstract class Circle extends Shape{
    private int radius;
}
C.
public class Circle extends Shape{
    private int radius;
    public void draw();
}
D.
public abstract class Circle implements Shape{
    private int radius;
    public void draw();
}
E.
public class Circle extends Shape{
    private int radius;
    public void draw() { code here }
}
F.
public abstract class Circle implements Shape{
    private int radius;
    public void draw() { code here}
}

1. 正確答案是 B, E
2. abstract 要用 extend 去實作抽象方法
3. abstract 可以包含有完成的方法及未完成的方法，但 interface 只能有未完成的方法
4. interface 要 implement 實作方法
5. interface 預設所有的方法 都是預設 public abstract 方法，且不能加入其他的修飾子
6. interface 可以多重繼承

參考資料
1. https://matthung0807.blogspot.com/2020/04/java-abstract-class-interface-difference.html
2. https://yubin551.gitbook.io/java-note/object_oriented_programming/interface

 */