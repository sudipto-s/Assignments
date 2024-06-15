/* Lab 1 - Linked List
 * 1. Create a singly linked list.
 * 2. Add nodes at the head of the list.
 * 3. Add nodes at the tail of the list.
 * 4. Delete node at Kth position.
 * 5. Sum to two Linked List.
 * 6. Print the list.
 */

class LL {
    int size = 0;
    Node head;
    static class Node {
        int val;
        Node next;
        Node(int v, Node n) {
            this.val = v;
            this.next = n;
        }
    }
    void addHead(int v) {
        head = new Node(v, head);
        size++;
    }
    void addTail(int v) {
        Node n = new Node(v, null);
        Node temp = head;
        if(head == null)
            head = n;
        else {
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
        size++;
    }
    void deleteKth(int k) {
        if(k > size || k < 1)
            return ;
        Node temp = head;
        if(k == 1) {
            head = head.next;
        } else {
            while(--k > 1)
                temp = temp.next;
            Node u = temp;
            temp = temp.next;
            u.next = temp.next;
        }
        size--;
    }
    static void addTwoLL(LL h1, LL h2) {
        Node hN1 = h1.head, hN2 = h2.head;
        while (hN1 != null && hN2 != null) {
            hN1.val += hN2.val;
            hN1 = hN1.next;
            hN2 = hN2.next;
        }
        if (hN1 == null) {
            while (hN2 != null) {
                h1.addTail(hN2.val);
                hN2 = hN2.next;
            }
        }
        h1.print();
    }
    void print() {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.val+" -> ");
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.addHead(50);
        l1.addHead(40);
        l1.addHead(30);
        l1.addHead(20);
        l1.addHead(10);
        l1.addTail(60);
        l1.print();
        l1.deleteKth(2);
        l1.print();
        LL l2 = new LL();
        l2.addHead(50);
        l2.addHead(40);
        l2.addTail(60);
        l2.print();
        // addTwoLL(l1, l2);
        addTwoLL(l2, l1);
    }
}
