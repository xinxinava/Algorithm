package com.littlebean.interview.actual.futu;

import java.util.Scanner;

public class FuTu2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] weight=new int[n];
        int[] value=new int[n];
        for(int i=0;i<n;i++){
            weight[i]=scanner.nextInt();
            value[i]=scanner.nextInt();
        }

        int maxn=Integer.MIN_VALUE;

        int[] dp=new int[m+1];
        for(int i=0;i<n;i++){
            for(int j=weight[i];j<=m;j++){
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
                maxn=Math.max(maxn,dp[j]);
            }
        }
        if(maxn==Integer.MIN_VALUE){
            System.out.println(0);
        }else {
            System.out.println(maxn);
        }
    }
}
