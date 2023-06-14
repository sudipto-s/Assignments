package DSA_2nd_Sem.Assignment4;

public class LinkedList {
    static Node create(Node start) {
        return start;
    }
    static void print(Node start) {
        Node temp = start;
        if (start == null) System.out.println("Empty list");
        else {
            while (start != null) {
                System.out.print(temp.data+" ");
            }
        }
    }
    public static void main(String[] args) {
        
    }
}