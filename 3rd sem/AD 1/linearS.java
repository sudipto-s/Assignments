class linearS {
    public static void main(String[] args) {
        int[] a = { 1, 5, 2, 9, 8, 7, 0, 4 };
        int k = 4;
        int r = lsearchI(a, a.length, k);
        // int r = lsearchR(a, a.length, k);
        if(r == -1)
            System.out.println(k+" not found");
        else
            System.out.println(k+" found at index: "+r);
    }
    static int lsearchI(int[] a, int n, int k) {
        for(int i = 0; i < n; i++)
            if(a[i] == k)
                return i;
        return -1;
    }
    static int lsearchR(int[] a, int n, int k) {
        if (n == 0)
            return -1;
        else if(a[n - 1] == k)
            return n - 1;
        return lsearchR(a, n - 1, k);
    }
}

