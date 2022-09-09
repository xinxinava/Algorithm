package com.littlebean.interview.actual.klook;

public class KLook2 {
    public static int Count(char[][] matrix) {
        //请在这里实现算法并返回结果
        int count=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    dfs(matrix, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] matrix, int x, int y){
        if(x<0||x==matrix.length||y<0||y==matrix[0].length){
            return;
        }
        if (matrix[x][y] == '1') {
            matrix[x][y]=0;
            dfs(matrix, x+1,y);
            dfs(matrix, x-1,y);
            dfs(matrix, x, y+1);
            dfs(matrix, x, y-1);
        }
    }
}
