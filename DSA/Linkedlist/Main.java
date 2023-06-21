// package Linkedlist;

// public class Main {
//     public static void main(String[] args) {
//         LinkedList myLinkedList = new LinkedList(4);
//     }
// }


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        // myLinkedList.makeEmpty();
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.prepend(0);
        myLinkedList.printList();


        // myLinkedList

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

    }

}