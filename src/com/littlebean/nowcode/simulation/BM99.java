package com.littlebean.nowcode.simulation;

public class BM99 {
    //先对角线交换，再垂直中轴线对折
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
        return mat;
    }
}
