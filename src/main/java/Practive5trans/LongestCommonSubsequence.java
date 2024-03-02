package Practive5trans;

public class LongestCommonSubsequence {
	   public static void main(String[] args) {
	        String str1 = "ABCD";
	        String str2 = "ACDF";
	        System.out.println("Longest Common Subsequence: " + findLCS(str1, str2));
	    }

	    private static String findLCS(String str1, String str2) {
	        int m = str1.length();
	        int n = str2.length();
	        int[][] dp = new int[m + 1][n + 1];

	        // Build the dp matrix using bottom-up dynamic programming
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        // Use the dp matrix to backtrack and find the longest common subsequence
	        int i = m, j = n;
	        StringBuilder lcs = new StringBuilder();
	        while (i > 0 && j > 0) {
	            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
	                lcs.insert(0, str1.charAt(i - 1));
	                i--;
	                j--;
	            } else if (dp[i - 1][j] > dp[i][j - 1]) {
	                i--;
	            } else {
	                j--;
	            }
	        }

	        return lcs.toString();
	    }

}
