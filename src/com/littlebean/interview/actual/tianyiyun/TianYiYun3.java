package com.littlebean.interview.actual.tianyiyun;

import java.util.Scanner;

public class TianYiYun3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int strong=scanner.nextInt();
        int n=scanner.nextInt();

        //实用价值，即背包价值
        int[] value=new int[n];
        for(int i=0;i<n;i++){
            value[i]=scanner.nextInt();
        }

        //消耗体力，即背包体积
        int m=scanner.nextInt();
        int[] weight=new int[m];
        for(int i=0;i<m;i++){
            weight[i]=scanner.nextInt();
        }
        int[] dp=new int[strong+1];
        for(int i=0;i<weight.length;i++){
            for(int j=strong;j>=weight[i];j--){
                dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);

            }
        }

        System.out.println(dp[strong]);
    }
}
