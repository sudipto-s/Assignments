import java.util.*;
public class Q5 {
    public static <T> int count(T[] a, T item) {
        int c = 0;
        for (T i : a)
            if (i.equals(item))
                c++;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = new Integer[5];
        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter element to find: ");
        int e = sc.nextInt();
        sc.close();
        System.out.println("Number of times "+e+" present in the array is: "+count(a, e));
    }
}
