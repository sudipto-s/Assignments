package DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLL myDLL = new DoublyLL(1);

        // myDLL.makeEmpty();
        myDLL.append(2);
        myDLL.append(3);
        myDLL.printList();

        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(2).value);






        // myDLL.getHead();
        // myDLL.getTail();
        // myDLL.getLength();
        myDLL.printList();
    }
}
