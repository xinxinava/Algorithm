package com.littlebean.nowcode.dp;

public class BM80 {
    public int maxProfit (int[] prices) {
        // write code here
        int n=prices.length;
        int[][] dp=new int[n][2];
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for(int i=1; i<n; i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][0]+prices[i],dp[i-1][1]);
        }
        return dp[n-1][1];
    }
}
