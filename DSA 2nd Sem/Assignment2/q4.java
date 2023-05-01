class q4 {
    String pid;
    double price;
    static double tot_price;
    q4(String pid, double price) {
       this.pid = pid;
       this.price = price;
    }
    void display() {
        System.out.println(pid+"\tPrice: "+price);
    }
    static double totalAmount(q4[] pr) {
        for (int i = 0; i < pr.length; i++)
            tot_price += pr[i].price;
        return tot_price;
    }
public class q4 {
    public static void main(String[] args) {
        Product[] p =  new Product[5];
        p[0] = new Product("Screw", 879);
        p[1] = new Product("Bolt", 258.1);
        p[2] = new Product("Spanner", 156);
        p[3] = new Product("Wire", 2500.1);
        p[4] = new Product("Pipe", 916.6);
        for (int i = 0; i < p.length; i++)
            p[i].display();
        System.out.println(totalAmount(p));
    }
}
