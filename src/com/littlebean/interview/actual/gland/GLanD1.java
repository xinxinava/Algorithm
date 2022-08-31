package com.littlebean.interview.actual.gland;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GLanD1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] launch=new int[n];
        int[] recive=new int[n];
        Map<Integer, Integer> lanMap=new HashMap<>();
        Map<Integer, Integer> recMap=new HashMap<>();

        for(int i=0;i<n;i++){
            launch[i]=scanner.nextInt();
            lanMap.put(launch[i], i);
        }
        for(int i=0;i<n;i++){
            recive[i]=scanner.nextInt();
            recMap.put(recive[i],i);
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=lanMap.get(recive[i]);
        }


        int[] dp=new int[n];
        dp[0]=1;
        int maxn=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(ans[i]<ans[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxn=Math.max(maxn,dp[i]);
        }
        System.out.println(maxn);
    }
}
