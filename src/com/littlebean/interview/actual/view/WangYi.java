package com.littlebean.interview.actual.view;

import java.util.Scanner;

public class WangYi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            c[i]=scanner.nextInt();
        }
        System.out.println(compute(n, a, b, c));
    }

    public static int compute(int n, int[] a, int[] b, int[] c){
        int[][] dp=new int[3][n];

        dp[0][0]=a[0];
        dp[1][0]=b[0];
        dp[2][0]=c[0];

        for(int i=1;i<n;i++){
            dp[0][i]=a[i]+Math.min(dp[1][i-1],dp[2][i-1]);
            dp[1][i]=b[i]+Math.min(dp[0][i-1],dp[2][i-1]);
            dp[2][i]=c[i]+Math.min(dp[0][i-1],dp[1][i-1]);
        }
        return Math.min(dp[0][n-1],Math.min(dp[1][n-1],dp[2][n-1]));
    }
}
