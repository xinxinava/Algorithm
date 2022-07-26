package com.littlebean.nowcode.dp;

public class BM64 {
    public int minCostClimbingStairs (int[] cost) {
        // write code here
        if(cost.length<=1){
            return cost[0];
        }
        int dp0=cost[0], dp1=cost[1];
        for(int i=2;i<cost.length;i++){
            int dpi=Math.min(dp0, dp1)+cost[i];
            dp0=dp1;
            dp1=dpi;
        }
        return Math.min(dp0, dp1);
    }
}
