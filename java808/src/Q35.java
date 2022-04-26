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
2. 
 */