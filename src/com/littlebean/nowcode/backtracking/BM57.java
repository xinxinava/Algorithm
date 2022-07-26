package com.littlebean.nowcode.backtracking;

public class BM57 {
    public int solve (char[][] grid) {
        // write code here
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    backtracking(grid,i,j);
                }
            }
        }
        return count;
    }
    public void backtracking(char[][] grid, int x, int y){
        grid[x][y]='0';
        if(x-1>=0&&grid[x-1][y]=='1'){
            backtracking(grid, x-1,y);
        }
        if(x+1<grid.length&&grid[x+1][y]=='1'){
            backtracking(grid, x+1,y);
        }
        if(y-1>=0&&y<grid[0].length&&grid[x][y-1]=='1'){
            backtracking(grid, x,y-1);
        }
        if(y+1<grid[0].length&&grid[x][y+1]=='1'){
            backtracking(grid, x,y+1);
        }
    }
}
