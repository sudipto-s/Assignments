import java.util.*;
class Book {
    String Bname, Bedition;
    double Bprice;
    Book(String name, String edition, double price) {
        this.Bname = name;
        this.Bedition = edition;
        this.Bprice = price;
    }
    void display() {
        System.out.println(Bname+"\t"+Bedition+"\t"+Bprice);
    }
}
public class HQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[2];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter book name, edition & price:");
            b[i] = new Book(sc.next(), sc.next(), sc.nextDouble());
        } sc.close();
        System.out.println("Name\t"+"Edition\t"+"Price");
        for (Book i : b)
            i.display();
        double e = b[0].Bprice;
        int j = 0;
        for(int i = 0; i < b.length; i++)
            if(e < b[i].Bprice)
                j = i;
        System.out.println("Book with maximum price:");
        System.out.println("Name: "+b[j].Bname+"\nEdition: "+b[j].Bedition+"\nPrice: "+b[j].Bprice);
    }
}
