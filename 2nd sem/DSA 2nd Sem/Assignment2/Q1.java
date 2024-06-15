class Phone {
    int area_code;
    int exchange;
    int number;
    void input(int a, int b, int c) {
        area_code = a;
        exchange = b;
        number = c;
    }
    String display() {
        return "("+area_code+") "+exchange+"-"+number;
    }
}
public class Q1{
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.area_code = 212;
        p1.exchange = 767;
        p1.number = 8900;
        p2.input(415, 555, 1212);
        System.out.println("My number is "+p1.display());
        System.out.println("Your number is "+ p2.display());
    }
}
