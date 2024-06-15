/* Lab 6 - Divide & Conquer */

/* Merge sort */

import java.util.*;
public class MergeSort {
    static int[] merge(int a1[], int a2[]) {
        int combined[] = new int[a1.length + a2.length];
        int index = 0, i = 0, j = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                combined[index++] = a1[i++];
            } else {
                combined[index++] = a2[j++];
            }
        }
        while (i < a1.length) {
            combined[index++] = a1[i++];
        }
        while (j < a2.length) {
            combined[index++] = a2[j++];
        }
        return combined;
    }

    static int[] mergeSort(int a[], int left, int right) {
        if (left == right) {
            return new int[]{a[left]};
        }
        
        int mid = left + (right - left) / 2;
        
        int[] leftArray = mergeSort(a, left, mid);
        int[] rightArray = mergeSort(a, mid + 1, right);
        
        return merge(leftArray, rightArray);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, 7, 1, 9, 6, 3 };
        int[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArr));
    }
}
