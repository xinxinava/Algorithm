package com.littlebean.leetcode.dp;

public class L53 {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n];
        dp[0]=nums[0];
        int maxn=dp[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            maxn=Math.max(dp[i],maxn);
        }
        return maxn;
    }
}
