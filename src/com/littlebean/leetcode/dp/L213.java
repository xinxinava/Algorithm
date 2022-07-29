package com.littlebean.leetcode.dp;

public class L213 {
    public int rob(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[2][n];
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        int n1=robNums(nums,0,n-2);
        int n2=robNums(nums, 1, n-1);
        return Math.max(n1, n2);
    }
    public int robNums(int[] nums, int start, int end){
        int[] dp=new int[nums.length];
        if(start==end)
            return nums[start];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
