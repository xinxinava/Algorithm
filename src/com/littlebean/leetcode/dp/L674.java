package com.littlebean.leetcode.dp;

public class L674 {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=1;
        int maxn=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                dp[i]=dp[i-1]+1;
            }else {
                dp[i]=1;
            }
            maxn=Math.max(maxn, dp[i]);
        }
        return maxn;
    }
}
