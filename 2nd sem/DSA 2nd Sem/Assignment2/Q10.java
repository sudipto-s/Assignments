import P1.*;
import P2.*;

public class Q10 implements Sports {
    public static void main(String[] args) {
        Test s = new Test();
        s.inputS("A", 12);
        s.inputM(78, 89);

        s.outputS();
        s.outputM();
        System.out.println("Score1: "+Sports.score1+"\t"+"Score2: "+Sports.score2);
    }
}
