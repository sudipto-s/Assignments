import java.util.*;

public class Lab3 {
    /* Q1 - Bubble sort */
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // record a swap
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted.
            if (!swapped)
                break;
        }
    }

    /* Q2i - Linear search iterative - O(n) = 1, S(n) = 1 */
    static int linearSearchIte(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    /* Q2ii - Linear search recursive - O(n) = n, S(n) = n */
    static int linearSearchRec(int[] arr, int n, int x) {
        if (n <= 0)
            return -1;
        else if (arr[n - 1] == x)
            return n - 1;
        else
            return linearSearchRec(arr, n - 1, x);
    }

    /* Q3i - Compute a^n iterative - O(n) = n, S(n) = 1 */
    static int powIte(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= a;
        return result;
    }

    /* Q3ii - Compute a^n recursive - O(n) = ..., S(n) = ... */
    static int powRec(int a, int n) {
        if (n == 0)
            return 1;
        int res = powIte(a, n / 2);
        if (n % 2 == 0)
            return res * res;
        else
            return a * res * res;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 3 };

        System.out.println("Before sorting: "+Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("After sorting: "+Arrays.toString(arr));

        System.out.println(linearSearchIte(arr, arr.length, 2));
        System.out.println(linearSearchRec(arr, arr.length, 2));
        
        System.out.println(powIte(5, 5));
        System.out.println(powRec(2, 3));
    }
}
/*
 * HW
 * Dijkstra's algorithm
 */
