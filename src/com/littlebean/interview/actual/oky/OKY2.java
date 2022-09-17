package com.littlebean.interview.actual.oky;

import java.util.Scanner;

public class OKY2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=scanner.nextInt();
        }
        int ans=Math.max(rob(price,0, n-2), rob(price, 1, n-1));
        System.out.println(ans);
    }

    public static int rob(int[] price, int start, int end){
        int[] dp=new int[price.length];
        dp[start]=price[start];
        dp[start+1]=Math.max(price[start],price[start+1]);
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1], dp[i-2]+price[i]);
        }
        return dp[end];
    }
}
