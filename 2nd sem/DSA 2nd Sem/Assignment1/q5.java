import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        int s = 0;

        for (; ;) {
            for (; n != 0; n /= 10)
                s += n % 10;
            if (s > 9) {
                n = s;
                System.out.println(n);
                s = 0;
            } else
                break;
        }
        System.out.println(s);
    }
}
