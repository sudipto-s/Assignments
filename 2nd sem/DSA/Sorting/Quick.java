package Sorting;

import java.util.Arrays;

public class Quick {
    public static void swap(int a[], int firstIndex, int secondIndex) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
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
    public static void quickHelper(int a[], int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(a, left, right);
            quickHelper(a, left, pivotIndex - 1);
            quickHelper(a, pivotIndex + 1, right);
        }
    }
    public static void quick(int a[]) {
        quickHelper(a,0, a.length - 1);
    }

    public static void main(String[] args) {
        int array[] = {4, 6, 1, 7, 3, 2, 5};

        quick(array);

        System.out.println(Arrays.toString(array));
    }
}
