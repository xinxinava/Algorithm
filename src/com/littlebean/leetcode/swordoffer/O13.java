package com.littlebean.leetcode.swordoffer;

public class O13 {
    //没有回溯，遍历统计不在回去了
    int res=0;
    public int movingCount(int m, int n, int k) {
        boolean[][] visited=new boolean[m][n];
        dfs(m, n, 0, 0, visited, k);
        return res;
    }
    public void dfs(int m, int n, int x, int y, boolean[][] visited, int k){
        if(x<0||x>=m||y<0||y>=n||check(x,y)>k||visited[x][y])
            return;
        visited[x][y]=true;
        int[][] direct={{-1, 0}, {0, -1}, {0, 1},{1, 0}};
        res++;
        for(int i=0;i<4;i++){
            int newx=x+direct[i][0];
            int newy=y+direct[i][1];
            dfs(m, n, newx, newy, visited, k);
        }
    }
    public int check(int a, int b){
        int sum=0;
        while (a!=0){
            sum+=a%10;
            a=a/10;
        }
        while (b!=0){
            sum+=b%10;
            b=b/10;
        }
        return sum;
    }
}
