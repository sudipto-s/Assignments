/* Lab 7 */

/* Matrix chain multiplication */

public class matrixChain {
    static int matrix(int arr[], int i, int j) {
        if (i == j)
            return 0;

        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = matrix(arr, i, k) + matrix(arr, k + 1, j) + arr[i - 1] * arr[k] * arr[j];
            min = Math.min(min, count);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 100, 10 };    /* M1:= 10 x 100 | M2:= 100 x 10 */
        System.out.println(matrix(arr, 1, arr.length - 1));
    }
}
