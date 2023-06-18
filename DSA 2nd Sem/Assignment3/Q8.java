package DSA_2nd_Sem.Assignment3;

public class Q8 {
    int n;
    static void reverse(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        else
            System.out.print(n%10);
        reverse(n/10);
    }

    public static void main(String[] args) {
        int n = 1456;
        reverse(n);
    }
}
