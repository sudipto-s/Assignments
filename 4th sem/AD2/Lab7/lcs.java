/* Lab 7 - Dynamic Programming */

/* Largest common subsequence */

public class lcs {
    static int lCS(String s1, String s2, int l1, int l2) {
        if (l1 == 0 || l2 == 0)
            return 0;
        if (s1.charAt(l1 - 1) == s2.charAt(l2 - 1))
            return 1 + lCS(s1, s2, l1 - 1, l2 - 1);
        else
            return max(lCS(s1, s2, l1, l2 - 1), lCS(s1, s2, l1 - 1, l2));
    }

    static void largestString(String s1, String s2, int l1, int l2) {
        int[][] dpGrid = new int[l1 + 1][l2 + 2];
        StringBuilder lcsString = new StringBuilder();
        int row = 0, col = 0;
        while (row < l1 && col < l2) {
            if (s1.charAt(row) == s2.charAt(col)) {
                lcsString.append(s1.charAt(row));
                row++;
                col++;
            } else if (dpGrid[row + 1][col] >= dpGrid[row][col + 1]) {
                row++;
            } else {
                col++;
            }
        }
        System.out.println(lcsString);
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        String s1 = "abcde", s2 = "ace";
        System.out.println(lCS(s1, s2, s1.length(), s2.length()));
        largestString(s2, s2, s2.length(), s2.length());
    }
}
