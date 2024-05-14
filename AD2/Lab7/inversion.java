/* Lab 7 */

/* Counting inversion */

public class inversion {
    static int countInversions(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int sm = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    sm++;
            }
            count += sm;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 2 };
        System.out.println("Number of inversions are: "+countInversions(arr, arr.length));
    }
}
