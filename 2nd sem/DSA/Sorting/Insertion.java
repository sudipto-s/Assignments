package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void insertion(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j > -1 && temp < a[j]) {
                a[j+1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {4, 2, 6, 5, 1, 3};

        insertion(array);

        System.out.println(Arrays.toString(array));
    }
}
