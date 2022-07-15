package com.littlebean.nowcode.dp;

public class BM66 {
    public String LCS (String str1, String str2) {
        // write code here
        int m=str1.length(), n=str2.length();
        int[][] dp=new int[m+1][n+1];
        int maxn=0, x=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(str1.charAt(i-1)== str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]>maxn){
                        maxn=dp[i][j];
                        x=i;
                    }
                }else {
                    dp[i][j]=0;
                }
            }
        }
        StringBuffer ss=new StringBuffer();
        while (maxn>0){
            ss.append(str1.charAt(x-1));
            x--;
            maxn--;
        }
        return ss.reverse().toString();
    }
}
