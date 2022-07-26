package com.littlebean.nowcode.dp;

public class BM82 {
    public int maxProfit (int[] prices) {
        // write code here
        int n=prices.length;
        int[][] dp=new int[n][5];
        dp[0][1]=-prices[0];
        dp[0][3]=-prices[0];
        for(int i=1;i<n;i++){
            dp[i][1]=Math.max(dp[i-1][0]-prices[i], dp[i-1][1]);
            dp[i][2]=Math.max(dp[i-1][1]+prices[i], dp[i-1][2]);
            dp[i][3]=Math.max(dp[i-1][2]-prices[i], dp[i-1][3]);
            dp[i][4]=Math.max(dp[i-1][3]+prices[i], dp[i-1][4]);
        }
        return dp[n-1][4];
    }
}
