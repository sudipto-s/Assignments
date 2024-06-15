package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void bubble(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {4, 2, 6, 5, 1, 3};

        bubble(array);

        System.out.println(Arrays.toString(array));
    }
}
