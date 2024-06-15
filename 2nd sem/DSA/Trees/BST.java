package Trees;
import java.util.ArrayList;
import java.util.LinkedList;

public class BST {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node (int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return true;
        }
        Node temp = root;
        while (true) {
            if (node.value < temp.value) {
                if (temp.left == null) {
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node curr = root;
        LinkedList<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (queue.size() > 0) {
            curr = queue.remove();
            result.add(curr.value);
            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }
        return result;
    }
    
}
