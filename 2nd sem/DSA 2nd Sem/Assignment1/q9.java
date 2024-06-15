import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for square matrix: ");
        int n = sc.nextInt();
        double a[][] = new double[n][n];
        System.out.println("Enter a "+ n+"-by-"+n +" matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextDouble();
        
        sc.close();
        System.out.println("Sum of elements of major diagonal is "+sumMajorDiagonal(a));
    }

    public static double sumMajorDiagonal(double a[][]) {
        for (double[] i : a)
            System.out.println(Arrays.toString(i));
        
        double s = 0;
        for (int i = 0; i < a.length; i++)
            s += a[i][i];
            
        return s;
    }
}
