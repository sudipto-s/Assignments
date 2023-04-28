import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int s = 0, p = 1;

        for (; n != 0; n /= 10) {
            s += n % 10;
            p *= n % 10;
        }
        System.out.println(s == p ? "Spy number":"Not a spy number");
    }
}
