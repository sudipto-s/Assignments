public class LinkedList {

// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	private Node head;
	private Node tail;
	private int length;
	
	class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" ");
            temp = temp.next;
        }System.out.println();
    }

    //Head
    public void getHead() {
        if (head == null)
            System.out.println("Head: null");
        else
            System.out.println("Head: " + head.value);
    }

    //Tail
    public void getTail() {
        if (head == null)
            System.out.println("Tail: null");
        else
            System.out.println("Tail: " + tail.value);
    }

    //Length
    public void getLength() {
        System.out.println("Length: " + length);
    }

    //Clear list
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    //Append at the end
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //Remove Last
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    // Prepend beginning
    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //Remove First
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) tail = null;
        return temp;
    }

    //Get element of a position
    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++)
            temp = temp.next;
        return temp;
    }

    //Set element at a particular
    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    //Insert 
    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        Node newN = new Node(value);
        Node temp = get(index-1);
        newN.next = temp.next;
        temp.next = newN;
        length++;
        return true;
    }

    //
    public Node remove(int index) {
        if(index < 0 || index > length) return null;

        if(index == 0) return removeFirst();
        
        if(index == length-1) return removeLast();
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp = null;
        length--;
        return temp;
    }

    //Reverse
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node mid() {
        Node slow = head;
	Node fast = head;
        while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}
	return slow;
    }

    public Boolean hasLoop() {
        Node slow = head;
	Node fast = head;
	while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
            if (slow == fast)
		    return true;
	}
	return false;
    }
}
