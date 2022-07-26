package com.littlebean.nowcode.dp;

public class BM73 {
    public int getLongestPalindrome (String A) {
        // write code here
        int n=A.length();
        if(n<2){
            return n;
        }
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        int maxn=1;
        for(int L=2;L<=n;L++){
            for(int i=0;i<n;i++){
                int j=L+i-1;
                if(j>=n){
                    break;
                }
                if(A.charAt(i)!=A.charAt(j)){
                    dp[i][j]=false;
                }else {
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j]&&j-i+1>maxn){
                    maxn=j-i+1;
                }
            }
        }
        return maxn;
    }
}
