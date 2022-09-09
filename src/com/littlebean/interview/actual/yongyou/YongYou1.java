package com.littlebean.interview.actual.yongyou;

public class YongYou1 {
    public long calculateTotal (int count) {
        // write code here
        int[] dp=new int[count+3];
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=count;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[count];
    }
}
