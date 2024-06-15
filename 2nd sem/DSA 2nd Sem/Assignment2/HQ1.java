import java.util.*;
class Commission {
    double sales;
    Commission(double sales) {
        this.sales = sales;
    }
    String getComm(double sale) {
        if (sale >= 0 && sale < 100)
            return "Rs "+sale * 0.02;
        else if (sale >= 100 && sale < 500)
            return "Rs "+sale * 0.03;
        else if (sale >= 500 && sale < 5000)
            return "Rs "+sale * 0.05;
        else if (sale >= 5000)
            return "Rs "+sale * 0.08;
        else
            return "Invalid Input!";
    }
}
public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales: ");
        double sale = sc.nextDouble();
        sc.close();
        Commission p = new Commission(sale);
        System.out.println(p.getComm(sale));
    }
}
