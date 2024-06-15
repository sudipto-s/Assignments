import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row & coloumn of array:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        sc.close();
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
                s += a[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum= "+s);
    }
}
