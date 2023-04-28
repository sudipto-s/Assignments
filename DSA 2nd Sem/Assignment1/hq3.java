import java.util.*;
public class hq3 {
    public static void main(String[] args) {
        // int a[] = {1, 2, 3};
        // int b[] = {4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter elements of 1st array:");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter elements of 2st array:");
        for (int i = 0; i < a.length; i++)
            b[i] = sc.nextInt();
        sc.close();
        int c[] = new int[n];
        
        for (int i = 0; i < c.length; i++)
            c[i] = a[i]*b[i];
        
        System.out.println(Arrays.toString(c));
    }
}
