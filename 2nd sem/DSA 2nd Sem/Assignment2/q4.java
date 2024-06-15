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
    public static void main(String[] args) {
        q4[] p =  new q4[5];
        p[0] = new q4("Screw", 879);
        p[1] = new q4("Bolt", 258.1);
        p[2] = new q4("Spanner", 156);
        p[3] = new q4("Wire", 2500.1);
        p[4] = new q4("Pipe", 916.6);
        for (int i = 0; i < p.length; i++)
            p[i].display();
        System.out.println("Total amount payable: "+ totalAmount(p));
    }
}
