class Complex {
    int real, imag;
    void set(int a, int b) {
        real = a;
        imag = b;
    }
    void display() {
       System.out.println(real+" i"+imag);
    }
    public static Complex add(Complex n1, Complex n2) {
        Complex r = new Complex();
        r.real = n1.real + n2.real;
        r.imag = n1.imag + n2.imag;
        return r;
    }
}
public class q2 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.set(1,2);
        c2.set(3,4);
        c1.display();
        c2.display();
        Complex r = c1.add(c1, c2);
        r.display();
    }
}
