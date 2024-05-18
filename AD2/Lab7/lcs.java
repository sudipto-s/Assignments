/* Lab 7 */

/* Largest common subsequence */

public class lcs {
    static int lCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dpGrid = new int[n + 1][m + 1];

        for (int row = n - 1; row >= 0; row--) {
            for (int col = m - 1; col >= 0; col--) {
                if (s1.charAt(row) == s2.charAt(col)) {
                    dpGrid[row][col] = 1 + dpGrid[row + 1][col + 1];
                } else {
                    dpGrid[row][col] = Math.max(dpGrid[row + 1][col], dpGrid[row][col + 1]);
                }
            }
        }
        return dpGrid[0][0];
    }
    public static void main(String[] args) {
        String s1 = "abcde", s2 = "ace";
        System.out.println(lCS(s1, s2));
    }
}
