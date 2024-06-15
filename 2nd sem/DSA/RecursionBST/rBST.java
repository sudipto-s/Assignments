public class rBST {
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

    private boolean contains(Node curr, int value) {
        if (curr == null) return false;
        if (curr.value == value) return true;
        if (value < curr.value) return contains(curr.left, value);
        else return contains(curr.right, value);
    }
    public boolean contains(int value) {
        return contains(root, value);
    }

    private Node rinsert(Node curr, int value) {
        if (curr == null)
            return new Node(value);
        if (value < curr.value)
            curr.left = rinsert(curr.left, value);
        else
            curr.right = rinsert(curr.right, value);
        return curr;
    }
    public void rinsert(int value) {
        if (root == null) root = new Node(value);
        rinsert(root, value);
    }

    private Node delete(Node curr, int value) {
        if (curr == null) return null;
        if (value < curr.value)
            curr.left = delete(curr.left, value);
        else
            curr.right = delete(curr.right, value);
        return curr;
    }
    public void delete(int value) {
        delete(root, value);
    }
}
