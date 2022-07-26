package com.littlebean.nowcode.dp;

import java.util.Arrays;

public class BM70 {
    public int minMoney (int[] arr, int aim) {
        // write code here
        int[] dp=new int[aim+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i];j<=aim;j++){
                if(dp[j-arr[i]]!=Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j - arr[i]] + 1, dp[j]);
                }
            }
        }
        if(dp[aim]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[aim];
    }
}
