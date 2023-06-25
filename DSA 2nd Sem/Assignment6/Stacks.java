package DSA_2nd_Sem.Assignment6;
import java.util.*;

public class Stacks {
    private static Node top;
    private int height;
    class Node {
        int info;
        Node next;
        Node(int info) {
            this.info = info;
        }
    }
    public Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while(c != 0) {
            System.out.print("Enter info: ");
            Node n = new Node(sc.nextInt());
            if (top == null)
            top = n;
            else {
                n.next = top;
                top = n;
            }
            height++;
            System.out.print("1 to continue: ");
            c = sc.nextInt();
        }
        return top;
    }
    public Node pop(Node top) {
        Node temp = top;
        if (height == 0)
            return null;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
    public void display(Node top) {
        Node temp = top;
        if (top == null)
            System.out.println("Empty stack");
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stacks s = new Stacks();
        Node top = null;
        top = s.push(top);
        s.display(top);
        System.out.println(s.pop(top).info);
        s.display(top);
    }
}
