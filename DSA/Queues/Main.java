package Queues;

public class Main {
    public static void main(String[] args) {
        Queue que = new Queue(2);

        que.enqueue(1);
        que.enqueue(0);

        // System.out.println(que.dequeue().value);
        // System.out.println(que.dequeue().value);
        System.out.println();
        que.getFirst();
        que.getLast();
        que.getLength();
        que.printQueue();
    }
}
