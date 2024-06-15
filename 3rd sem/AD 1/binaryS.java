class binaryS {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 4, 5, 7, 8, 9 };
        int k = 5;
        // int r = bsearchI(a, k, 0, a.length - 1);
        int r = bsearchR(a, k, 0, a.length - 1);
        if(r == -1)
            System.out.println(k+" not found");
        else
            System.out.println(k+" found at index: "+r);
    }
    static int bsearchI(int[] a, int k, int s, int e) {
        while (s <= e) {
            int m = (s + e)/2;
            if(a[m] == k)
                return m;
            else if(a[m] < k)
                s = m + 1;
            else
                e = m - 1;
        }
        return -1;
    }
    static int bsearchR(int[] a, int k, int s, int e) {
        if (e > 0) {
            int m = s + (e - s)/2;
            if(a[m] == k)
                return m;
            else if(a[m] > k)
                return bsearchR(a, k, 0, m - 1);
            else
                return bsearchR(a, k, m + 1, e);
        } else
            return -1;
    }
}

