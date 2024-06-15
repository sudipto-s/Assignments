package DoublyLL;

public class DoublyLL {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLL(int value) {
        Node newN = new Node(value);
        head = newN;
        tail = newN;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }System.out.println();
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newN = new Node(value);
        if (length == 0) {
            head = newN;
            tail = newN;
        } else {
            tail.next = newN;
            newN.prev = tail;
            tail = newN;
        }length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        } length--;
        return temp;
    }

    public void prepend(int value) {
        Node newN = new Node(value);
        if (length == 0) {
            head = newN;
            tail = newN;
        } else {
            newN.next = head;
            head.prev = newN;
            head = newN;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            // temp.next = null;
        } length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2)
            for (int i = 0; i < index; i++)
                temp = temp.next;
        else {
            temp = tail;
            for (int i = length - 1; i > index; i--)
                temp = temp.prev;
        }
        return temp;
    }
}
