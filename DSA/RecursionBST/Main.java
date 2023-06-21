public class Main {
    public static void main(String[] args) {
        rBST bst = new rBST();

        bst.insert(2);
        bst.insert(1);
        bst.insert(3);

        System.out.println(bst.root.value);
    }
}
