import java.util.*;
class Student {
    String name, branch;
    int roll;
    void inputS(String name, String branch, int roll) {
        this.name = name;
        this.branch = branch;
        this.roll = roll;
    }
    void displayS() {
        System.out.print(name+"\t"+roll+"\t"+branch+"\t");
    }
}
class Exam extends Student {
    double mrk1, mrk2, mrk3;
    void inputM(double mrk1, double mrk2, double mrk3) {
        this.mrk1 = mrk1;
        this.mrk2 = mrk2;
        this.mrk3 = mrk3;
    }
    void displayR() {
        System.out.println(mrk1+"\t"+mrk2+"\t"+mrk3);
    }
}
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam[] s = new Exam[2];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter details:");
            s[i] = new Exam();
            s[i].inputS(sc.next(), sc.next(), sc.nextInt());
            s[i].inputM(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        } sc.close();
        System.out.println("Name\t"+"Roll\t"+"Branch\t"+"M1\t"+"M2\t"+"M3");
        for (int i = 0; i < s.length; i++) {
            s[i].displayS();
            s[i].displayR();
        }
    }
}
