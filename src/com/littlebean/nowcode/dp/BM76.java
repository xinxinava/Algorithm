package com.littlebean.nowcode.dp;

public class BM76 {
    public boolean match (String str, String pattern) {
        // write code here
        int m=str.length();
        int n=pattern.length();
        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int i=0;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(pattern.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(isMatch(str, pattern, i, j-1)){
                        dp[i][j]=dp[i][j]||dp[i-1][j];
                    }
                }else {
                    if(isMatch(str, pattern, i, j)){
                        dp[i][j]=dp[i-1][j-1];
                    }
                }
            }
        }
        return dp[m][n];
    }
    public boolean isMatch(String str, String pattern, int i, int j){
        if(i==0){
            return false;
        }
        if(pattern.charAt(j-1)=='.'){
            return true;
        }
        return str.charAt(i-1)==pattern.charAt(j-1);
    }
}
