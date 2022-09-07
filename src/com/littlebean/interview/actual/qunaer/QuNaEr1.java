package com.littlebean.interview.actual.qunaer;

public class QuNaEr1 {
    public int maxScore (int energy, int[][] actions) {
        // write code here
        int[] dp=new int[energy+1];
        int maxn=Integer.MIN_VALUE;
        int n=actions.length;
        int[] weight=new int[n];
        int[] value=new int[n];
        for(int i=0;i<n;i++){
            weight[i]=actions[i][0];
            value[i]=actions[i][1];
        }
        for(int i=0;i<n;i++){
            for(int j=energy;j>=weight[i];j--){
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
                maxn=Math.max(maxn,dp[j]);
            }
        }
        if(maxn==Integer.MIN_VALUE){
            return 0;
        }
        return maxn;
    }
}
