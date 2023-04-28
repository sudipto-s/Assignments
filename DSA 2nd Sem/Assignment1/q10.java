import java.util.*;
public class q10 {
    public static void main(String[] args) {
        // double a[][] = {{1.5, 2, 3, 4}, {5.5, 6, 7, 8}, {9.5, 1, 3, 1}};
        double a[][] = new double[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                a[i][j] = sc.nextDouble();

        sc.close();

        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of elements at coloumn "+i+" is "+sumColoumn(a, i));
        }
    }
    public static double sumColoumn(double a[][], int j) {
        double s = 0;
        for (int i = 0; i < a.length; i++)
            s += a[i][j];
            
        return s;
    }
}
