package DSA_2nd_Sem.Assignment4;
import java.util.*;

public class SinglyLinkedList {
    private static Node head = null;
    
    static class Node {
        private int redg;
        private int mark;
        private Node next;
        Node(int redg, int mark) {
            this.redg = redg;
            this.mark = mark;
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static Node create(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration no. & mark: ");
        Node n = new Node(sc.nextInt(), sc.nextInt());
        start = n;
        start.next = null;
        return start;
    }
    public static Node addAtBeg(Node start) {   //ai
        if (start == null)
            return create(start);
        System.out.print("Enter registration no. & mark: ");
        Node n = new Node(sc.nextInt(), sc.nextInt());
            n.next = start;
            start = n;
        return start;
    }
    public static Node addAtEnd(Node start) {   //aii
        if (start == null)
            return addAtBeg(start);
        System.out.print("Enter registration no. & mark: ");
        Node n = new Node(sc.nextInt(), sc.nextInt());
        Node temp = start;
        while (temp.next != null)
            temp = temp.next;
        temp.next = n;
        return start;
    }
    public static Node addAtPos(Node start) {   //aiii
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos <= 0 || pos > count(start) + 1)
            System.out.println("Position out of bound!");
        else if (pos == 1 || start == null)
            return addAtBeg(start);
        else if (pos == count(start) + 1)
            return addAtEnd(start);
        else {
            Node temp = start;
            while(--pos > 1)
                temp = temp.next;
            System.out.print("Enter registration no. & mark: ");
            Node n = new Node(sc.nextInt(), sc.nextInt());
            n.next = temp.next;
            temp.next = n;
        }
        return start;
    }
    public static Node delAtBeg(Node start) {   //bi
        if (start == null)
            return null;
        Node temp = start;
        start = start.next;
        temp.next = null;
        System.out.println("Removed: "+temp.redg);
        return start;
    }
    public static Node delAtEnd(Node start) {   //bii
        if (start == null)
        return null;
        Node temp = start;
        Node last = null;
        if (start.next == null) {
            last = start;
            start = null;
        } else {
            while(temp.next.next != null)
            temp = temp.next;
            last = temp.next;
            temp.next = null;
        }
        System.out.println("Removed: "+temp.redg);
        return start;
    }
    public static Node delAtPos(Node start) {   //biii
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (start == null || pos <= 0 || pos > count(start))
            System.out.println("Invalid position!");
        else {
            Node temp = start;
            Node toRemove = null;
            if (pos == 1)
                return delAtBeg(start);
            if (pos == count(start))
                return delAtEnd(start);
            while(--pos > 1)
                temp = temp.next;
            toRemove = temp.next;
            temp.next = toRemove.next;
            toRemove.next = null;
            System.out.println("Removed: "+toRemove.redg);
        }
        return start;
    }
    public static Node delAny(Node start) {     //biv
        if (start == null)
            return null;
        System.out.print("Enter registration no. to delete : ");
        int Redg = sc.nextInt();
        Node temp = start;
        Node toRemove = null;
        if (start.redg == Redg) {
            toRemove = start;
            start = start.next;
        } else {
            while (temp.next != null) {
                if (temp.next.redg == Redg) {
                    toRemove = temp.next;
                    temp.next = toRemove.next;
                    break;
                }
                temp = temp.next;
            }
            if (toRemove == null) {
                System.out.println("Registration number "+Redg+" not found!");
                return start;
            }
        }
        toRemove.next = null;
        System.out.println("Removed: "+toRemove.redg);
        return start;
    }
    public static void search(Node start) {     //c
        if (start == null)
            System.out.println("Empty list!");
        else {
            System.out.print("Enter registration number: ");
            int Redg = sc.nextInt();
            Node temp = start;
            while (temp != null) {
                if (temp.redg == Redg) {
                    System.out.println("Student found: |"+temp.redg+" "+temp.mark+"|");
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public static void sort(Node start) {   //d NOT YET
        if (start == null)
            System.out.println("Empty list!");
        else if (start.next == null)
            System.out.println("List sorted!");
        else {
            Node maxValueNode;
            Node temp;
            Node newHead = null;
            while (start.next != null) {
                maxValueNode = start;
                temp = start.next;
                while (temp != null) {
                    if (temp.mark > maxValueNode.mark)
                        maxValueNode = temp;
                    temp = temp.next;
                }
                newHead = addAtBeg(newHead);
                newHead.next = delAny(start);
            }
            start = addAtBeg(newHead);
            start.next = start;
        }
    }
    public static int count(Node start) {   //e
        int c = 0;
        Node temp = start;
        for(; temp != null; c++)
            temp = temp.next;
        return c;
    }
    public static Node reverse(Node start) {    //f NOT YET
        if (start == null)
            return null;
        Node temp = start.next, temp2;
        start.next = null;
        while (temp != null) {
            temp2 = temp.next;
            start = addAtBeg(start);
            start.next = temp;
            temp = temp2;
        }
        return start;
    }
    public static void display(Node start) {    //g
        Node temp = start;
        if (start == null)
            System.out.println("Empty list");
        else {
            while (temp != null) {
                System.out.print("|"+temp.redg+" "+temp.mark+"| ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
		// Node start = null;
        int choice;
		
		for(;;)	{
			System.out.println("\nMenu");
			System.out.println(" 1. Insert at beginning");
			System.out.println(" 2. Insert at end");
			System.out.println(" 3. Insert at position");
			System.out.println(" 4. Remove from beginning");
			System.out.println(" 5. Remove from end");
			System.out.println(" 6. Remove from position");
			System.out.println(" 7. Remove specific student");
			System.out.println(" 8. Search student");
			System.out.println(" 9. Display list");
			System.out.println("10. Count list");
			System.out.println("11. Reverse list(NOT YET)");
			System.out.println("12. Sort list(NOT YET)");
			System.out.println(" 0. Exit");
			System.out.print("\nEnter choice: ");
			
			choice = Integer.parseInt(sc.next());			
			switch(choice) {
				case 1:
                    head = addAtBeg(head);
					break;
				case 2:
					head = addAtEnd(head);
                    break;
				case 3:
					head = addAtPos(head);
                    break;
				case 4:
					head = delAtBeg(head);
                    break;
				case 5:
                    head = delAtEnd(head);
					break;
				case 6:
                    head = delAtPos(head);
                    break;	
				case 7:
                    head = delAny(head);
					break;
				case 8:
                    search(head);
					break;
				case 9:
					display(head);
					break;
				case 10:
                    System.out.println("List size: "+count(head));
					break;
				case 11:
                    head = reverse(head);
					break;
				case 12:
                    sort(head);
					break;
				case 0:
					System.exit(0);
                    break;
				default:
					System.out.println("Invalid choice!");
			}
		}
    }
}
