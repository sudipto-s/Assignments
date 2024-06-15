package Stack;

public class Stack {
    private Node top;
    private int height;
    class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        if (temp == null)
            System.out.println("Empty stack");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        if (top == null)
            System.out.println("Top: null");
        else
            System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Length: " + height);
    }

    public void makeEmpty() {
        top = null;
        height = 0;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (height == 0)
            top = node;
        else {
            node.next = top;
            top = node;
        }
        height++;
    }

    public Node pop() {
        Node temp = top;
        if (height == 0)
            return null;
        top = top.next;
        // temp.next = null;
        height--;
        return temp;
    }
}
