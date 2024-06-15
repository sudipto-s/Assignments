class unique {
    public static void main(String[] args) {
        int[] a = {4, 4, 2, 1, 1, 6, 6};
        System.out.println(unik(a, a.length));
    }
    static int unik(int[] a, int n) {
        int s = 0;
        for(int i : a)
            s = s ^ i;
        return s;
    }
}

