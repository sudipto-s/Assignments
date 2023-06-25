package DSA_2nd_Sem.Assignment7;

public class Queues {
    Node front;
    Node rear;
    int length;
    class Node {
        int info;
        Node next;
        Node(int info) {
            this.info = info;
        }
    }
    public Node insert(Node rear, Node front) {
        return rear;
    }
    public Node delete(Node rear, Node front) {
        return rear;
    }
    public void display(Node rear, Node front) {
        Node temp = front;
        if (front == null)
            System.out.println("Empty queue");
        while (temp != null) {
            System.out.print(temp.info+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queues q = new Queues();
        Node front = null, rear = null;
        front = q.insert(rear, front);
    }
}
