class Q {
    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 6, 5, 4, 9, 2, 7 };
        System.out.println(maxA(a, a.length));
        // r4(a, a.length);
    }
    //Q1 - Find first repeated elements in an array
    static int r1(int[] a, int n) {
        for(int i = 0; i < n; i++)
            for(int j = i+1; j < n; j++)
                if(a[i] == a[j])
                    return a[i];
        return -1;
    }
    //Q2 - Print duplicates in a list
    static void r2(int[] a, int n) {
        for(int i = 0; i < n; i++)
            for(int j = i+1; j < n; j++)
                if(a[i] == a[j])
                    System.out.println(a[i]+" ");
    }
    //Q3 - Find the missing number in an array
    static int r3(int[] a, int n) {
        int []t = new int[n+1];
        int c = 0;
        for(int i = 0; i < n; i++)
            t[a[i] - 1] = 1;
        for(int i = 0; i <= n; i++)
            if(t[i] == 0)
                c = i + 1;
        return c;
    }
    //Q4 - Given an array, find the element pair with minimum/maximum difference
    static void r4(int[] a, int n) {
        int minDiff = Integer.MAX_VALUE, maxDiff = Integer.MIN_VALUE,
        min1 = -1, min2 = -1, max1 = -1, max2 = -1;
        for(int i = 0; i < n-1; i++)
            for(int j = i+1; j < n; j++) {
                int currDif = Math.abs(a[i] - a[j]);
                if(currDif > maxDiff) {
                    maxDiff = currDif;
                    max1 = a[i];
                    max2 = a[j];
                } else if (currDif < minDiff) {
                    minDiff = currDif;
                    min1 = a[i];
                    min2 = a[j];
                }
            }
        System.out.println("Minimun difference: "+min1+" & "+min2+": "+minDiff);
        System.out.println("Maximun difference: "+max1+" & "+max2+": "+maxDiff);
    }
    //Q5 - Given  a list, find the elements which appears maximun number of times
    static int maxA(int[] a, int n) {
        int maxC = 0, maxF = 0;
        for(int i = 0; i < n; i++) {
            int c = 0;
            for(int j = 0; j < n; j++)
                if(a[i] == a[j])
                    c++;
            if(c > maxC) {
                maxC = c;
                maxF = a[i];
            }
        }
        return maxF;
    }
}
