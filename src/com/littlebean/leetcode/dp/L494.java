package com.littlebean.leetcode.dp;

public class L494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        if((target>sum)||(target+sum)%2!=0)
            return 0;
        int x=(target+sum)/2;
        if(x<0)
            return 0;
        int[] dp=new int[x+1];
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            for(int j=x;j>=nums[i];j--)
                dp[j]+=dp[j-nums[i]];
        }
        return dp[x];
    }
}
