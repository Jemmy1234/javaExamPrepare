package Q1_50;
class MissingInfoException extends Exception {
}

class AgeOutofRangeException extends Exception {
}

class Candidate {
    String name;
    int age;

    Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String toString() {
        return name + " age: " + age;
    }
}

public class Q16 {
    public static void main(String[] args) 
    // throws MissingInfoException, AgeOutofRangeException {
    throws Exception {
        Candidate c = new Candidate("James", 20);
        Candidate c1 = new Candidate("Williams", 32);
        System.out.println(c);
        System.out.println(c1);
    }
}

/**
 * 此題的重點是
 * 1. 因為 Candidate 最後只有拋出 Exception, 
 * 所以 main 只能 throws Exception , 不能丟出其他類型的例外
 * 就算丟出 Candidate 實際丟出的例外類型也沒用
 */
