package DSA_2nd_Sem.Assignment6;
import java.util.*;

public class StackArray {
    public static final int max = 5;
    public static int push(int[] S, int top) {
        Scanner sc = new Scanner(System.in);
        if (top == S.length - 1)
            return -1;
        for (int i = 0; i < S.length; i++) {
            System.out.print("Enter "+(i+1)+"th value: ");
            S[++top] = sc.nextInt();
        }
        return top;
    }
    public static int pop(int[] S, int top) {
        if (isEmpty(top))
            return -1;
        int temp = S[top - 1];
        top--;
        return S[temp];
    }
    public static void display(int[] S, int top) {
        if (top == -1)
            System.out.println("Empty stack!");
        for (int i = top; i >= 0; i--)
            System.out.println(S[i]);
    }
    public static boolean isEmpty(int top) {
        return top == -1;
    }
    public static boolean isFull(int top, int max) {
        return top == max - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int top = -1;
        int[] S = new int[max];
        for(;;) {
            System.out.println("***MENU***");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    top = push(S, top);
                    break;
                case 2:
                    System.out.println(pop(S, top));
                    System.out.println(top);
                    break;
                case 3:
                    display(S, top);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
