package DSA_2nd_Sem.Assignment3;

import java.util.*;
public class HQ2 {
 static int binaryS(int a[], int start, int end, int key) {
        if (end >= start && start <= a.length - 1)  { 
            int mid = start + (end - start) / 2;
            if (a[mid] == key)
                return mid;
            if (a[mid] > key)
                return binaryS(a, start, mid - 1, key);

            return binaryS(a, mid + 1, end, key);
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in ascending order");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        int result = binaryS(a, 0, a.length-1, x);
        System.out.println(result == -1 ? ("The "+x+" is not present in the array") : ("The "+x+" is present at index "+result));
        sc.close();
    }
}
