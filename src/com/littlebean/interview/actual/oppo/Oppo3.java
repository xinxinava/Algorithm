package com.littlebean.interview.actual.oppo;

public class Oppo3 {
    public long tourismRoutePlanning (int scenicspot) {
        // write code here
        int[] dp=new int[scenicspot+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=scenicspot;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[scenicspot];
    }
}
