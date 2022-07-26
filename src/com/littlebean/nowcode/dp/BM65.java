package com.littlebean.nowcode.dp;

public class BM65 {
    public String LCS (String s1, String s2) {
        // write code here
        int m=s1.length(), n=s2.length();
        if(m==0||n==0){
            return "-1";
        }
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        StringBuffer sb=new StringBuffer();
        int x=m, y=n;
        while (x>0&&y>0){
            while (x>0&&dp[x][y]==dp[x-1][y]){
                x--;
            }
            while (y>0&&dp[x][y]==dp[x][y-1]){
                y--;
            }
            if(x>0)
                sb.append(s1.charAt(x-1));
            x--;
            y--;
        }
        if(sb.length()==0)
            return "-1";
        return sb.reverse().toString();
    }
}
