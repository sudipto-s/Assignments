class Deposit {
    long principle;
    int time;
    double rate;
    double t_amt;
    Deposit() { }
    Deposit(long principle, int time, double rate) {
        this.principle = principle;
        this.time = time;
        this.rate = rate;
    }
    Deposit(long principle, int time) {
        this.principle = principle;
        this.time = time;
    }
    Deposit(long principle, double rate) {
        this.principle = principle;
        this.rate = rate;
    }
    void display() {
        System.out.println(principle+"\t\t"+time+"\t"+rate+"\t"+t_amt);
    }
    void calc_amt() {
        t_amt = principle + ((principle * rate * time)/100);
    }
}
public class q5 {
    public static void main(String[] args) {
        System.out.println("Principle\t"+"Time\t"+"Rate\t"+"Total");
        Deposit p1 = new Deposit();
        Deposit p2 = new Deposit(50000, 1, 5.7);
        Deposit p3 = new Deposit(50000, 1);
        Deposit p4 = new Deposit(50000, 5.7);
        p2.calc_amt();
        p3.calc_amt();
        p4.calc_amt();
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
