package DSA_2nd_Sem.Assignment6;
import java.util.*;

public class StackLL {
    static class Node {
        int info;
        Node next;
        Node(int info) {
            this.info = info;
        }
    }
    public static Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter info: ");
        Node n = new Node(sc.nextInt());
        n.next = top;
        top = n;
        return top;
    }
    public static Node pop(Node top) {
        if (top == null)
            System.out.println("Empty stack!");
        else {
            System.out.println("Popped: "+top.info);
            top = top.next;
        }
        return top;
    }
    public static void display(Node top) {
        Node temp = top;
        if (top == null)
            System.out.println("Empty stack!");
        else {
            System.out.println("Elements in stack:");
            while (temp != null) {
                System.out.println(temp.info);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;
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
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
