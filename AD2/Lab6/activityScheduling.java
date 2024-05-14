/* Lab 6 */

/* Activity scheduling problem */

public class activityScheduling {
    static void scheduling(int[] S, int[] F, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (F[j] > F[j + 1]) {
                    int temp = F[j];
                    F[j] = F[j + 1];
                    F[j + 1] = temp;
                    temp = S[j];
                    S[j] = S[j + 1];
                    S[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        int i = 0;
        System.out.print("Job number: " + (i+1) + " ");
        for (int j = 1; j < n; j++) {
            if (S[j] >= F[i]) {
                System.out.print((j+1) + " ");
                i = j;
            }
        }
    }
    public static void main(String[] args) {
        int[] S = { 5, 1, 11, 6, 0, 3, 5, 3, 8, 2, 8 };
        int[] F = { 7, 4, 14, 10, 6, 5, 9, 8, 12, 13, 11 };
        scheduling(S, F, S.length);
    }
}