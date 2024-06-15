import java.util.*;
class selection {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 20, 10, 9};
        System.out.println(Arrays.toString(a));
        selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    static void selectionSort(int[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i; j < n; j++)
                if(a[j] < a[min])
                    min = j;
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
    }
}
