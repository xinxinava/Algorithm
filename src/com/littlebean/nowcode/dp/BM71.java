package com.littlebean.nowcode.dp;

import java.util.Arrays;

public class BM71 {
    public int LIS (int[] arr) {
        // write code here
        if(arr.length==0){
            return 0;
        }
        int[] dp=new int[arr.length];
        Arrays.fill(dp, 1);
        int maxn=1;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    dp[j] = Math.max(dp[j],dp[i]+1);
                    maxn = Math.max(maxn, dp[j]);
                }
            }
        }
        return maxn;
    }
}
