import java.util.*;
public class hq4 {
    public static void main(String[] args) {
        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{5, 6}, {7, 8}};
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter length, same for both arrays: ");
        // int n = sc.nextInt();
        // double a[][] = new double[n][n];
        // double b[][] = new double[n][n];
        // System.out.println("Enter elements of 1st array:");
        // for (int i = 0; i < b.length; i++)
        //     for (int j = 0; j < b.length; j++)
        //         a[i][j] = sc.nextDouble();
        // System.out.println("Enter elements of 2st array:");
        // for (int i = 0; i < b.length; i++)
        //     for (int j = 0; j < b.length; j++)
        //         b[i][j] = sc.nextDouble();
        // sc.close();

        System.out.println("\nResulting array: ");
        for (double[] i : addMatrix(a, b))
            System.out.println(Arrays.toString(i));
    }

    public static double[][] addMatrix(double a[][], double b[][]) {
        int l = a.length;
        double c[][] = new double[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++)
                c[i][j] = a[i][j] + b[i][j];}

        return c;
    }
}
