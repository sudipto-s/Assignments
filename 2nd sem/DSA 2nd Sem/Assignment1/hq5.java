import java.util.*;
public class hq5 {
    public static void main(String[] args) {
        int rm = 0, d = 0, cm = 0, b = 0;
        int[][] a = new int[4][4];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                a[i][j] = (int)(2*Math.random());

        for (int[] i : a)
            System.out.println(Arrays.toString(i));

        for (int i = 0; i < a.length; i++) {
            int r = 0, c = 0;
            for (int j = 0; j < a.length; j++) {
                r += a[i][j];
                c += a[j][i];
            }
            if (c > b) {
                b = c;
                cm = i;
            }
            if (r > d) {
                d = r;
                rm = i;
            }
        }
        System.out.println("Largest row index: "+rm);
        System.out.println("Largest col index: "+cm);
    }
}
