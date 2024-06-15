import java.util.*;
public class insertion {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 20, 10, 9};
        System.out.println(Arrays.toString(a));
        insertionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    static void insertionSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
            int t = a[min_idx];
            a[min_idx] = a[i];
            a[i] = t;
        }
    }
}

