/* Lab 6 - Divide & Conquer */

/* Quick sort */

import java.util.*;
public class QuickSort {
    public static int pivot(int a[], int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex+1; i <= endIndex; i++) {
            if (a[i] < a[pivotIndex]) {
                swapIndex++;
                swap(a, swapIndex, i);
            }
        }
        swap(a, pivotIndex, swapIndex);
        return swapIndex;
    }
    public static void quick(int a[], int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(a, left, right);
            quick(a, left, pivotIndex - 1);
            quick(a, pivotIndex + 1, right);
        }
    }
    public static void swap(int a[], int firstIndex, int secondIndex) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
    
    public static void main(String[] args) {
        int array[] = { 4, 6, 1, 7, 3, 2, 5 };

        quick(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}

