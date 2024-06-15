package Sorting;

import java.util.Arrays;

public class Selection {
    public static void selection(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++)
                if (a[j] < a[minIndex])
                    minIndex = j;
            if (i != minIndex) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {4, 2, 6, 5, 1, 3};

        selection(array);

        System.out.println(Arrays.toString(array));
    }
}
