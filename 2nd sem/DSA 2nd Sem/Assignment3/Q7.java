package DSA_2nd_Sem.Assignment3;

import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for factoorial\n2 for power");
        System.out.println("3 for GCD\n4 for Decimal to binary");
        System.out.println("5 for product");
        int c;
        do {
            System.out.print("Enter choice / 0 to exit: ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println("Factoorial of "+n+" is: "+facto(n));
                    break;
                case 2:
                    System.out.print("Enter X & N: ");
                    int x = sc.nextInt();
                    int N = sc.nextInt();
                    System.out.println("X^N = "+pow(x, N));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter first number: ");
                    int n2 = sc.nextInt();
                    System.out.println("GCD of "+n1+" & "+n2+" is: "+gcd(n1, n2));
                    break;
                case 4:
                    System.out.print("Enter a decimal number: ");
                    int d = sc.nextInt();
                    System.out.println(d+" in binary is: "+bToD(d));
                    break;
                case 5:
                    System.out.print("Enter first number: ");
                    int f1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int f2 = sc.nextInt();
                    System.out.println(f1+"*"+f2+" = "+prod(f2, f1));
                    break;
                default:
                    System.out.println("Termination successful!");
                    break;
            }
        } while (c != 0);
        sc.close();
    }
    public static int facto(int n) {
        if (n == 0)
            return 1;
        return n * facto(n - 1);
    }
    public static double pow(int x, int n) {
        if (n == 0)
            return 1;
        return Math.pow(x, n-1)*x;
    }
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static String bToD(int n) {
        if (n == 0)
            return "0";
        else if (n == 1)
            return "1";
        else
            return bToD(n / 2) + String.valueOf(n % 2);
    }
    public static int prod(int a, int b) {
        if (b != 0)
            return a + prod(a, b-1);
        return 0;
    }
}
