import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int c = 0;
        for (; n >= 2; c++)
            n /= 2;
        System.out.println(c);
    }
}
