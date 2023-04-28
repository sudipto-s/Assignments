public class q2 {
    int real, imag;
    void set(int a, int b) {
        real = a;
        imag = b;
    }
    void display() {
       System.out.println(real+" i"+imag);
    }
    public static q2 add(q2 n1, q2 n2) {
        q2 r = new q2();
        r.real = n1.real + n2.real;
        r.imag = n1.imag + n2.imag;
        return r;
    }
    public static void main(String[] args) {
        q2 c1 = new q2();
        q2 c2 = new q2();
        c1.set(1,2);
        c2.set(3,4);
        c1.display();
        c2.display();
        q2 r = add(c1, c2);
        r.display();
    }
}
