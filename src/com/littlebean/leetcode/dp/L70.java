package com.littlebean.leetcode.dp;

public class L70 {
    public int climbStairs(int n) {
        if(n<=1)
            return n;
        int dp1=1;
        int dp2=2;
        for(int i=2;i<=n;i++){
            int temp=dp1+dp2;
            dp1=dp2;
            dp2=temp;
        }
        return dp2;
    }
}
