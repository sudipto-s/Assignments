import java.util.*;
class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String n) {
        super(n);
    }
}

public class Q3 {
    public static void main(String[] args) {
        String name;
        double marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter mark: ");
        marks = sc.nextDouble();
        sc.close();
        try {
            if (marks > 100)
                throw new MarksOutOfBoundException("Mark can't be greater than 100");
            System.out.println(name+" has got "+marks);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
