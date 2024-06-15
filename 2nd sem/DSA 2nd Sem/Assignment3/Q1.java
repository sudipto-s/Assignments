import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky numebr: ");
        int n = sc.nextInt();
        sc.close();
        try {
            if (n < 0)
                throw new NumberFormatException("Negative number");
            System.out.println("Your lucky number is: "+n);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
