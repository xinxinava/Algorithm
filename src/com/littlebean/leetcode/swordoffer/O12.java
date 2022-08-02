package com.littlebean.leetcode.swordoffer;

public class O12 {
    public boolean exist(char[][] board, String word) {
        int m=board.length, n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board, i, j, visited, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int x, int y, boolean[][] visited, String word, int idx){
        if(board[x][y]!=word.charAt(idx))
            return false;
        if(idx==word.length()-1){
            return true;
        }
        visited[x][y]=true;
        int[][] direct={{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        for(int i=0;i<4;i++){
            int newx=x+direct[i][0];
            int newy=y+direct[i][1];
            if(newx>=0&&newx<board.length&&newy>=0&&newy<board[0].length&&visited[newx][newy]==false){
                if(dfs(board, newx, newy, visited, word, idx+1))
                    return true;
            }
        }
        visited[x][y]=false;
        return false;
    }
}
