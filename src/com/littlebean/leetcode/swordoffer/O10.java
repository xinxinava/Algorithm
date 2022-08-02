package com.littlebean.leetcode.swordoffer;

public class O10 {
    public int fib(int n) {
        int f0=0,f1=1;
        int base=1000000007;
        if(n==0)
            return 0;
        for(int i=2;i<=n;i++){
            int temp=f0+f1;
            temp=temp%base;
            f0=f1;
            f1=temp;
        }
        return f1;
    }

    public int numWays(int n) {
        if(n<=1)
            return 1;
        int dp1=1, dp2=2;
        int base=1000000007;
        for(int i=3;i<=n;i++){
            int temp=dp1+dp2;
            temp=temp%base;
            dp1=dp2;
            dp2=temp;
        }
        return dp2;
    }
}
