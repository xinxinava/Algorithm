package com.littlebean.interview.actual.oky;

import java.util.Scanner;

public class OKY1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=scanner.nextInt();
        }
        int[][] dp=new int[n][2*k+1];
        for(int i=1;i<=2*k;i+=2){
            dp[0][i]=-price[0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=2*k;j++){
                if(j%2==0){ //买入
                    dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-1]+price[i]);
                }else {  //买入
                    dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-1]-price[i]);
                }
            }
        }

        System.out.println(dp[n-1][2*k]);
    }
}
