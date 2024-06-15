package DSA_2nd_Sem.Assignment7;
import java.util.*;

public class QueueLL {
    static class Node {
        int info;
        Node next;
        Node(int info) {
            this.info = info;
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static Node enqueue(Node rear, Node front) {
        System.out.print("Enter info: ");
        Node n = new Node(sc.nextInt());
        if (front == null)
            front = n;
        else {
            Node temp = front;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
        return front;
    }
    public static Node dequeue(Node rear, Node front) {
        Node temp = front;
        if (front == null)
            System.out.println("Empty Queue!");
        else {
            front = front.next;
            temp.next = null;
            System.out.println("Deleted: "+temp.info);
        }
        return front;
    }
    public static void display(Node rear, Node front) {
        Node temp = front;
        if (front == null)
            System.out.println("Empty queue!");
        else {
            System.out.print("Elements in Queue: ");
            while (temp != null) {
                System.out.print(temp.info+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node front = null, rear = null;
        for(;;) {
            System.out.println("***MENU***");
            System.out.println("1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Display");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    front = enqueue(rear, front);
                    break;
                case 2:
                    front = dequeue(rear, front);
                    break;
                case 3:
                    display(rear, front);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
