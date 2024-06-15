package Sorting;

import java.util.Arrays;

public class Merge {
    public static int[] merge(int a1[], int a2[]) {
        int combined[] = new int[a1.length + a2.length];
        int index = 0, i = 0, j = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                combined[index] = a1[i];
                index++;
                i++;
            } else {
                combined[index] = a1[j];
                index++;
                j++;
            }
        }
        while (i < a1.length) {
            combined[index] = a1[i];
            index++;
            i++;
        }
        while (j < a2.length) {
            combined[index] = a1[j];
            index++;
            j++;
        }
        return combined;
    }

    public static int[] mergeSort(int a[]) {
        if (a.length == 1) return a;

        int midIndex = a.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(a, 0, midIndex));
        int right[] = mergeSort(Arrays.copyOfRange(a, midIndex, a.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        // int a1[] = {1, 3, 7, 8};
        // int a2[] = {2, 4, 5, 6};
        int a[] = {3, 1, 4, 2};

        System.out.println(Arrays.toString(mergeSort(a)));
    }
}
