package P1;

public class Test extends Student {
    double mrk1;
    double mrk2;
    public void inputM(double m1, double m2) {
        mrk1 = m1;
        mrk2 = m2;
    }
    public void outputM() {
        System.out.println("Mark 1: "+mrk1+"\t"+"Mark 2: "+mrk2);
    }
}
