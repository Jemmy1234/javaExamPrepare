package Q151_120;

import java.util.ArrayList;
import java.util.List;

public class Q158 {
    public static void main(String[] args) {
        List cs = new ArrayList();
        cs.add("Java");
        cs.add("C");
        
        // Which code fragment, when inserted at line // insert code here, enables class
        // Test to print 123 : Fred : [Java, C]?

        // Student s = new Student(123, "Fred", cs);
        // System.out.println(s);
    }
}

class Student {
    int rollnumber;
    String name;
    List cources = new ArrayList();

    // insert code here

    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
}

/**
 * 答案 : Student (int rollnumber , String name, List cources) {...}
 * 
 * 本題重點:
 * 不能選 Student(int rollnumber , String name, ArrayList cources) {...}
 * 
 * 
 */
