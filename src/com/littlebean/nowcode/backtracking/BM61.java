package com.littlebean.nowcode.backtracking;

public class BM61 {
    public int solve (int[][] matrix) {
        // write code here
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m+1][n+1];
        int maxn=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maxn=Math.max(maxn, dfs(matrix, dp, i, j));
            }
        }
        return maxn;
    }
    public int dfs(int[][] matrix, int[][] dp, int x, int y){
        if(dp[x][y]!=0){
            return dp[x][y];
        }
        dp[x][y]++;
        int[][] dirs=new int[][]{{-1,0},{1,0}, {0,-1}, {0,1}};
        for(int i=0;i<4;i++){
            int newX=x+dirs[i][0];
            int newY=y+dirs[i][1];
            if(newX>=0&&newX<matrix.length&&newY>=0&&newY<matrix[0].length&&matrix[x][y]<matrix[newX][newY]){
                dp[x][y]=Math.max(dp[x][y],dfs(matrix,dp,newX,newY)+1);
            }
        }
        return dp[x][y];
    }
}
