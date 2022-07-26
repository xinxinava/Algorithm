package com.littlebean.leetcode.dp;

import javax.swing.*;

public class L343 {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],Math.max(dp[i-j]*j,j*(i-j)));
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print(dp[i]+" ");
        }
    //    System.out.println(dp);
        return dp[n];
    }

}
