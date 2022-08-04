package com.littlebean.leetcode.swordoffer;

public class O14 {
    public int cuttingRope(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
            }
        }
        return dp[n];
    }
    public int cuttingRope2(int n) {
        if(n<4)
            return n-1;
        long res=1;
        int base=1000000007;
        while (n>4){
            res=(res*3)%base;
            n-=3;
        }
        return (int)(res*n%base);
    }
}
