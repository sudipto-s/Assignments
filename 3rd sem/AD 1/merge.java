import java.util.*;
class merge {
    public static void main(String[] args) {
        int a1[] = {2, 6, 8, 10};
        int a2[] = {1, 5, 7, 9, 11};
        System.out.println(Arrays.toString(mergeA(a1, a1.length, a2, a2.length)));
    }
    static int[] mergeA(int[] a1, int n, int[] a2, int m) {
        int[] a = new int[n+m]; int i = 0, j = 0, k = 0;
        while(i < n && j < m)
            if(a1[i] < a2[j])
                a[k++] = a1[i++];
            else if(a1[i] > a2[j])
                a[k++] = a2[j++];
        if(i == n && j < m)
            while(j < m)
                a[k++] = a2[j++];
        else
            while(i < n)
                a[k++] = a2[i++];
        return a;
    }
}