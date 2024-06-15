package DSA_2nd_Sem.Assignment3;

import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at "+n+" is "+fibo(n));
        sc.close();
    }
    static int fibo(int n) {
        if (n <= 1)
            return n;
        return fibo(n-1) + fibo(n - 2);
    }
}
