package com.littlebean.nowcode.dp;

public class BM79 {
    public int rob (int[] nums) {
        // write code here
        if(nums.length==1){
            return nums[0];
        }
        int res1=robRoom(nums, 0, nums.length-2);
        int res2=robRoom(nums, 1, nums.length-1);
        return Math.max(res1, res2);
    }

    public int robRoom(int[] nums, int start, int end){
        if(start==end){
            return nums[start];
        }
        int[] dp=new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start], nums[start+1]);
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
