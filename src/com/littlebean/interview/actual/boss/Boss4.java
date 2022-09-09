package com.littlebean.interview.actual.boss;

import java.util.Scanner;

public class Boss4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=scanner.nextInt();
        }

        int[][] dp=new int[n][5];
        dp[0][1]=-prices[0];
        dp[0][3]=-prices[0];

        for(int i=1;i<n;i++){
            dp[i][1]=Math.max(dp[i-1][1],-prices[i]);
            dp[i][2]=Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
            dp[i][3]=Math.max(dp[i-1][3],dp[i-1][2]-prices[i]);
            dp[i][4]=Math.max(dp[i-1][4],dp[i-1][3]+prices[i]);
        }
        System.out.println(Math.max(dp[n-1][4],dp[n-1][2]));

    }
}
