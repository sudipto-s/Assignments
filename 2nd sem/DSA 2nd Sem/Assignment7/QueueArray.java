package DSA_2nd_Sem.Assignment7;
import java.util.*;

public class QueueArray {
    static Scanner sc = new Scanner(System.in);
    public static void enqueue(int Q[]) {
        if (isFull())
            System.out.println("Full queue!");
        else {
            System.out.print("Enter element: ");
            Q[++rear] = sc.nextInt();
            if (isEmpty())
                front++;
        }
    }
    public static void dequeue(int Q[]) {
        if (isEmpty())
            System.out.println("Empty queue, can't delete!");
        System.out.println("Deleted: "+Q[front]);
        if (rear == 0)
            front = rear = -1;
        else {
            for (int i = 1; i <= rear; i++)
                Q[i - 1] = Q[i];
            rear--;
        }
    }
    public static void display(int Q[]) {
        if (isEmpty())
            System.out.println("Empty queue, no items to show!");
        else {
            for (int i = front; i <= rear; i++)
                System.out.print(Q[i]+" ");
            System.out.println();
        }
    }
    public static boolean isFull() {
        return rear == max - 1;
    }
    public static boolean isEmpty() {
        return front == -1;
    }
    public static final int max = 5;
    public static int front = -1, rear = -1;
    public static void main(String[] args) {
        int[] Q = new int[max];
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
                    enqueue(Q);
                    break;
                case 2:
                    dequeue(Q);
                    break;
                case 3:
                    display(Q);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
