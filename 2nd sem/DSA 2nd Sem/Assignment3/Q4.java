import java.util.*;
class Q4 {
    public static <E> void name(E[] a) {
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] n = new Integer[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < n.length; i++)
            n[i] = sc.nextInt();
        name(n);
        Double[] m = new Double[5];
        System.out.println("Enter 5 double:");
        for (int i = 0; i < n.length; i++)
            m[i] = sc.nextDouble();
        sc.close();
        name(m);
    }
}
