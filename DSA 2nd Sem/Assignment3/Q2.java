import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = new String[4];
        for (int i = 0; i < c.length; i++)
            c[i] = sc.next();
        try {
            Integer.parseInt(c[0]);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.print("Enter one more color: ");
            c[5] = sc.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("The colors entered are: ");
            for (int i = 0; i < c.length; i++)
                System.out.print(c[i]+" ");
        sc.close();
    }
}
