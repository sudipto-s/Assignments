import java.util.*;
public class q7 {
    public static void main(String[] args) {
        // int a[] = {12, 14, 12, 14, 13};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int max = a[0], min = a[0], cmax = 0, cmin = 0, maxa = 0, mina = 0;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i])
                max = a[i];
            if(min > a[i])
                min = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] == max)
                cmax++;
            if(a[i] == min)
                cmin++;
        }
        
        for (int i = 0; i < a.length; i++)
            if(max == a[i]) {
                maxa = i;
                break;
            }
        for (int i = 0; i < a.length; i++)
            if(min == a[i])
                mina = i;

        System.out.println("Maximum element of array is: "+max+", occurs: "+cmax+" times");
        System.out.println("Minimum element of array is: "+min+", occurs: "+cmin+" times");
        System.out.println("First occurance of max element at position: "+ (maxa+1));
        System.out.println("Last occurance of min element at position: "+ (mina+1));
    }
}
