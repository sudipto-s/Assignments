package Stack;

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack(2);

        stk.makeEmpty();
        stk.printStack();

        stk.push(1);
        stk.push(0);
        stk.printStack();

        stk.pop();




        System.out.println();
        stk.getTop();
        stk.getHeight();
        stk.printStack();
    }
}
