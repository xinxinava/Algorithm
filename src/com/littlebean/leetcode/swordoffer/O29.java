package com.littlebean.leetcode.swordoffer;

import java.util.ArrayList;
import java.util.List;

public class O29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0)
            return new int[]{};
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        int idx=0;
        int[] ans=new int[(bottom+1)*(right+1)];
        while (left<=right&&top<=bottom){
            for(int i=left;i<right;i++){
                ans[idx++]=matrix[top][i];
            }
            top++;
            for(int i=top;i<bottom;i++){
                ans[idx++]=matrix[i][right];
            }
            right--;
            for(int i=right;i>left;i--){
                ans[idx++]=matrix[bottom][i];
            }
            bottom--;
            for(int i=bottom;i>top;i--){
                ans[idx++]=matrix[i][left];
            }
            left++;
        }
        return ans;
    }
}
