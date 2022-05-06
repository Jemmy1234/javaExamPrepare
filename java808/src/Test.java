import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List cs = new ArrayList();
        cs.add("Java");
        cs.add("C");
        
        Student s = new Student(123, "Fred", cs);
        System.out.println(s);
    }
}

class Student {
    int rollnumber;
    String name;
    List cources = new ArrayList();

    // insert code here
    Student(int rollnumber , String name, ArrayList cources) {
        this.cources = cources;
    }

    public String toString() {
        return rollnumber + " : " + name + " : " + cources;
    }
}

