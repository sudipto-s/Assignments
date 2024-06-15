import java.util.*;
public class bubble {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 20, 10, 9};
        System.out.println(Arrays.toString(a));
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    static void bubbleSort(int[] a, int n) {
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swapped = true;
                }
            if (!swapped)
                break;
        }
    }
}

