package com.littlebean.interview.actual.huawei2022;

public class HuaWei1 {
    public static void main(String[] args) {
        String a="abcde";
        String b="abc";
        int len=maxLen( a, b);
        System.out.println(len);
    }
    public static int maxLen(String a, String b){
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m+1][n+1];
        int maxn=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=dp[i-1][j-1];
                }
                maxn=Math.max(maxn, dp[i][j]);
            }
        }
        return maxn;

    }
}
