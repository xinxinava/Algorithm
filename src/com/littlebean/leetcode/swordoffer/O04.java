package com.littlebean.leetcode.swordoffer;

public class O04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int x=0,y=matrix[0].length-1;
        while (x<matrix.length&&y>=0){
            if(target>matrix[x][y]){
                x++;
            }else if(target<matrix[x][y]){
                y--;
            }else {
                return true;
            }
        }
        return false;
    }
}
