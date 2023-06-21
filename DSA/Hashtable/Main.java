public class Main {
    public static void main(String[] args) {
        HT ht = new HT();

        ht.set("nails", 100);
        ht.set("tile", 50);
        ht.set("lumber", 80);
        ht.set("bolts", 200);
        ht.set("screws", 140);
        
        ht.print();

        // System.out.println(ht.get("nails"));
        // System.out.println(ht.get("screws"));

        System.out.println(ht.keys());

    }
}
