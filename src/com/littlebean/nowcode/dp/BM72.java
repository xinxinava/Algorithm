package com.littlebean.nowcode.dp;

public class BM72 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] dp=new int[array.length];
        dp[0]=array[0];
        int maxn=array[0];
        for(int i=1;i<array.length;i++){
            dp[i]=Math.max(dp[i-1]+array[i],array[i]);
            maxn=Math.max(maxn, dp[i]);
        }
        return maxn;
    }
}
