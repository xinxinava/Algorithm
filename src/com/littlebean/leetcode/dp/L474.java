package com.littlebean.leetcode.dp;

public class L474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(String s:strs){
            int zeroNum=0,oneNum=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0')
                    zeroNum++;
                else
                    oneNum++;
            }
            for(int i=m;i>=zeroNum;i--){
                for(int j=n;j>=oneNum;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-zeroNum][j-oneNum]+1);
                }
            }
        }
        return dp[m][n];
    }
}
